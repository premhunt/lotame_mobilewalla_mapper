package com.kritterdmp;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Key;
import com.aerospike.client.Record;
import com.aerospike.client.policy.WritePolicy;
import com.kritter.dmp.thrift.struct.DMP;
import com.kritter.dmp.thrift.struct.UIDType;
import com.kritter.dmp.thrift.struct.UserId;
import com.kritterdmp.constants.LotameAudienceMapper;
import com.kritterdmp.constants.MobilewallaSegmentMapper;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;

import java.io.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Hello world!
 */
public class App {

    private WritePolicy writePolicy = new WritePolicy();
    private AerospikeClient aerospikeClient = null;
    @Getter
    @Setter
    private String hostName = null;
    @Getter
    @Setter
    private Integer portNumber = null;
    @Getter
    @Setter
    private String namespace = null;
    @Getter
    @Setter
    private String set = null;
    @Getter
    @Setter
    private String binName = null;

    private String getCountryCode(DMP dmp) {
        if(dmp != null && dmp.isSetGeo() && dmp.getGeo().isSetCountrycode() ){
            return dmp.getGeo().getCountrycode();
        }
        return "";
    }

    //initiate a connection to aerospike
    public void init() {
        this.setHostName("ec2-54-248-199-87.ap-northeast-1.compute.amazonaws.com");
        this.setPortNumber(3000);
        this.setNamespace("user_audience");
        this.setSet("user_data");
        this.setBinName("lotame");
        this.aerospikeClient = new AerospikeClient(this.getHostName(), this.getPortNumber());
        this.writePolicy.sendKey = true;
    }

    public int getRandom() {
        Random random = new Random();
        int r = random.nextInt() % 392;
        if (r > 0) {
            return r;
        }
        return getRandom();
    }

    public DMP deserialize(String s) throws Exception {
        Base64 base64 = new Base64();
        TDeserializer deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        byte[] bytes = base64.decode(s);
        DMP dmp = new DMP();
        try {
            deserializer.deserialize(dmp, bytes);
        } catch (TException e) {
        }
        return dmp;
    }

    public String getMappedSegment(String lotameId) {
        if (lotameId == null || lotameId.isEmpty()) {
            return null;
        }
        if (LotameAudienceMapper.lotameMap.containsKey(lotameId)) {
            String lotameVal = null;
            lotameVal = LotameAudienceMapper.lotameMap.get(lotameId);
            if (lotameVal.contains(">")) {
                lotameVal = lotameVal.substring(lotameVal.lastIndexOf(">") + 1);
            }
            for (MobilewallaSegmentMapper s : MobilewallaSegmentMapper.values()) {
                try {
                    if (s.getsegmentName().replaceAll(" ", "").equals(lotameVal.replaceAll(" ", ""))) {
                        return s.getsegmentId();
                    }
                    if (s.getsegmentName().replaceAll(" ", "").contains(lotameVal.replaceAll(" ", ""))) {
                        return s.getsegmentId();
                    }
                    if ((lotameVal.replaceAll(" ", "")).contains(s.getsegmentName().replaceAll(" ", ""))) {
                        return s.getsegmentId();
                    }

                    if(!lotameVal.isEmpty() && !s.getsegmentName().isEmpty()) {
                        String words[] = lotameVal.split(" ");
                        for (String word : words) {
                            if (s.getsegmentName().contains(word)) {
                                return s.getsegmentId();
                            }
                        }
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return null;
    }

    private String getRecord(String userId) {
        Key key = new Key(namespace, set, userId);
        if (aerospikeClient.exists(writePolicy, key)) {
            Record record = aerospikeClient.get(writePolicy, key);
            return record.getString("lotame");
        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String userId = null;
        String platform = null;
        String countryCode = null;
        String segments = null;

        App app = new App();
        app.init();

        String line = null;
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File("/home/ec2-user/nosmas/lotame_data")));

        try {
            while ((line = bufferedReader1.readLine()) != null) {
                userId = null;
                platform = null;
                if (line.contains("set") || line.contains("TIMEOUT") || line.contains("select") || line.contains("-----") || line.contains("lotame")) {
                    continue;
                }

                if (line.contains("aaid")) {
                    line = line.substring(line.indexOf("aaid"));
                    if (line.contains("\"")) {
                        line = line.substring(line.indexOf("aaid"), line.indexOf("\""));
                    }
                    line = line.replaceAll("\"", "").replaceAll(" ", "");
                    platform = "android";
                } else if (line.contains("ifa")) {
                    line = line.substring(line.indexOf("ifa"));
                    if (line.contains("\"")) {
                        line = line.substring(line.indexOf("ifa"), line.indexOf("\""));
                    }
                    line = line.replaceAll("\"", "").replaceAll(" ", "");
                    platform = "ios";
                } else {
                    continue;
                }

                userId = line;
                String rec = app.getRecord(userId);
                if(rec ==  null ){
                    continue;
                }

                try{
                    userId = userId.substring(userId.indexOf(":") + 1);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    continue;
                }

                DMP dmp = null;
                try {
                     dmp = app.deserialize(rec);
                }catch (Exception e){
                    System.out.println("ERror deserialiizng");
                    continue;
                }

                countryCode = app.getCountryCode(dmp);
                segments = app.getSegments(dmp);
                if(countryCode != null){
                    System.out.println(countryCode);
                }

                String format = "{\"userid\":\"" + userId + "\",\"platform\":\"" + platform + "\",\"country\":\"" + countryCode + "\",\"segments\":" + segments + "}";
                FileUtils.write(new File("/home/ec2-user/nosmas/part-m-00000"),format+"\n", true);
            }

        } catch (IOException e) {
        } catch (Exception e) {
        } finally {
            try {
                if (bufferedReader1 != null) {
                    bufferedReader1.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private String getSegments(DMP dmp) {
        if(dmp != null && dmp.isSetUserSegment() && dmp.getUserSegment().isSetLotameAudienceSet()){
            Set<String> s = dmp.getUserSegment().getLotameAudienceSet();
            Set<String>toReturn = new HashSet<String>();
            for(String st : s){
                String a = this.getMappedSegment(st);
                if(a != null && !a.isEmpty()){
                    toReturn.add("\"" + a + "\"");
                }
            }
            return toReturn.toString();
        }

        return null;
    }
}
