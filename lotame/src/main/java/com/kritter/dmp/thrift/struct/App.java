package com.kritter.dmp.thrift.struct;

import org.apache.commons.codec.binary.Base64;
import org.apache.thrift.TBase;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.protocol.TBinaryProtocol;

import java.io.*;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static int getRandom() {
        Random random = new Random();
        int r = random.nextInt() % 392;
        if (r > 0) {
            return r;
        }
        return getRandom();
    }

    public static String getPlatform(String prfix) {
        if (prfix != null && !prfix.isEmpty()) {
            if (prfix.equals("ifa")) {
                return "ios";
            } else if (prfix.equals("aaid")) {
                return "android";
            }
        }
        return null;
    }

    public static DMP deserialize(String s) throws Exception {
        TDeserializer tde = new TDeserializer(new TBinaryProtocol.Factory());
        Base64 decoder = new Base64();
        TBase t = (TBase) Class.forName("DMP").newInstance();
        tde.deserialize(t, decoder.decodeBase64(s.getBytes()));
        com.kritter.dmp.thrift.struct.DMP dmp = (com.kritter.dmp.thrift.struct.DMP) t;
        return dmp;
    }

    public static void main(String[] args) throws  FileNotFoundException {
        String userId = null;
        String platform = null;
        String countryCode = null;
        String segments = null;


        String line = null;
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(new File("/home/sam/codebase/pem_files/lotame_test")));

        try {
            while ((line = bufferedReader1.readLine()) != null) {
                if(line != null && !line.isEmpty()) {
                    try {
                        DMP dmp = deserialize(line);
                        if(dmp != null){
                            if(dmp.getUserId() != null){

                            }
                        }
                    }catch (Exception e){
                        continue;
                    }
                }
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


        String format = "{\"userid\":\"" + userId + "\",\"platform\":\"" + platform + "\",\"country\":\"" + countryCode + "\",\"segments\":[" + segments + "]}";
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom());
        }
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
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return null;
    }
}
