/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.kritter.audience.thrift.struct;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class AudienceSegment implements org.apache.thrift.TBase<AudienceSegment, AudienceSegment._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AudienceSegment");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField AGERANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("agerange", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TIERCATEGORY_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("tiercategoryMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AudienceSegmentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AudienceSegmentTupleSchemeFactory());
  }

  /**
   * Change version whenever there is change in the structure, more specifically when some field is removed.
   * Addition of a field doesn't require changes except for bookkeeping.
   */
  public byte version; // required
  public int gender; // optional
  public int agerange; // optional
  public Map<Integer,AudienceCategory> tiercategoryMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Change version whenever there is change in the structure, more specifically when some field is removed.
     * Addition of a field doesn't require changes except for bookkeeping.
     */
    VERSION((short)1, "version"),
    GENDER((short)2, "gender"),
    AGERANGE((short)3, "agerange"),
    TIERCATEGORY_MAP((short)4, "tiercategoryMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION
          return VERSION;
        case 2: // GENDER
          return GENDER;
        case 3: // AGERANGE
          return AGERANGE;
        case 4: // TIERCATEGORY_MAP
          return TIERCATEGORY_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __GENDER_ISSET_ID = 1;
  private static final int __AGERANGE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.GENDER,_Fields.AGERANGE,_Fields.TIERCATEGORY_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AGERANGE, new org.apache.thrift.meta_data.FieldMetaData("agerange", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIERCATEGORY_MAP, new org.apache.thrift.meta_data.FieldMetaData("tiercategoryMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AudienceCategory.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AudienceSegment.class, metaDataMap);
  }

  public AudienceSegment() {
    this.version = (byte)1;

  }

  public AudienceSegment(
    byte version)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AudienceSegment(AudienceSegment other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    this.gender = other.gender;
    this.agerange = other.agerange;
    if (other.isSetTiercategoryMap()) {
      Map<Integer,AudienceCategory> __this__tiercategoryMap = new HashMap<Integer,AudienceCategory>();
      for (Map.Entry<Integer, AudienceCategory> other_element : other.tiercategoryMap.entrySet()) {

        Integer other_element_key = other_element.getKey();
        AudienceCategory other_element_value = other_element.getValue();

        Integer __this__tiercategoryMap_copy_key = other_element_key;

        AudienceCategory __this__tiercategoryMap_copy_value = new AudienceCategory(other_element_value);

        __this__tiercategoryMap.put(__this__tiercategoryMap_copy_key, __this__tiercategoryMap_copy_value);
      }
      this.tiercategoryMap = __this__tiercategoryMap;
    }
  }

  public AudienceSegment deepCopy() {
    return new AudienceSegment(this);
  }

  @Override
  public void clear() {
    this.version = (byte)1;

    setGenderIsSet(false);
    this.gender = 0;
    setAgerangeIsSet(false);
    this.agerange = 0;
    this.tiercategoryMap = null;
  }

  /**
   * Change version whenever there is change in the structure, more specifically when some field is removed.
   * Addition of a field doesn't require changes except for bookkeeping.
   */
  public byte getVersion() {
    return this.version;
  }

  /**
   * Change version whenever there is change in the structure, more specifically when some field is removed.
   * Addition of a field doesn't require changes except for bookkeeping.
   */
  public AudienceSegment setVersion(byte version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public int getGender() {
    return this.gender;
  }

  public AudienceSegment setGender(int gender) {
    this.gender = gender;
    setGenderIsSet(true);
    return this;
  }

  public void unsetGender() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return EncodingUtils.testBit(__isset_bitfield, __GENDER_ISSET_ID);
  }

  public void setGenderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GENDER_ISSET_ID, value);
  }

  public int getAgerange() {
    return this.agerange;
  }

  public AudienceSegment setAgerange(int agerange) {
    this.agerange = agerange;
    setAgerangeIsSet(true);
    return this;
  }

  public void unsetAgerange() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AGERANGE_ISSET_ID);
  }

  /** Returns true if field agerange is set (has been assigned a value) and false otherwise */
  public boolean isSetAgerange() {
    return EncodingUtils.testBit(__isset_bitfield, __AGERANGE_ISSET_ID);
  }

  public void setAgerangeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AGERANGE_ISSET_ID, value);
  }

  public int getTiercategoryMapSize() {
    return (this.tiercategoryMap == null) ? 0 : this.tiercategoryMap.size();
  }

  public void putToTiercategoryMap(int key, AudienceCategory val) {
    if (this.tiercategoryMap == null) {
      this.tiercategoryMap = new HashMap<Integer,AudienceCategory>();
    }
    this.tiercategoryMap.put(key, val);
  }

  public Map<Integer,AudienceCategory> getTiercategoryMap() {
    return this.tiercategoryMap;
  }

  public AudienceSegment setTiercategoryMap(Map<Integer,AudienceCategory> tiercategoryMap) {
    this.tiercategoryMap = tiercategoryMap;
    return this;
  }

  public void unsetTiercategoryMap() {
    this.tiercategoryMap = null;
  }

  /** Returns true if field tiercategoryMap is set (has been assigned a value) and false otherwise */
  public boolean isSetTiercategoryMap() {
    return this.tiercategoryMap != null;
  }

  public void setTiercategoryMapIsSet(boolean value) {
    if (!value) {
      this.tiercategoryMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Byte)value);
      }
      break;

    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((Integer)value);
      }
      break;

    case AGERANGE:
      if (value == null) {
        unsetAgerange();
      } else {
        setAgerange((Integer)value);
      }
      break;

    case TIERCATEGORY_MAP:
      if (value == null) {
        unsetTiercategoryMap();
      } else {
        setTiercategoryMap((Map<Integer,AudienceCategory>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Byte.valueOf(getVersion());

    case GENDER:
      return Integer.valueOf(getGender());

    case AGERANGE:
      return Integer.valueOf(getAgerange());

    case TIERCATEGORY_MAP:
      return getTiercategoryMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case GENDER:
      return isSetGender();
    case AGERANGE:
      return isSetAgerange();
    case TIERCATEGORY_MAP:
      return isSetTiercategoryMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AudienceSegment)
      return this.equals((AudienceSegment)that);
    return false;
  }

  public boolean equals(AudienceSegment that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (this.gender != that.gender)
        return false;
    }

    boolean this_present_agerange = true && this.isSetAgerange();
    boolean that_present_agerange = true && that.isSetAgerange();
    if (this_present_agerange || that_present_agerange) {
      if (!(this_present_agerange && that_present_agerange))
        return false;
      if (this.agerange != that.agerange)
        return false;
    }

    boolean this_present_tiercategoryMap = true && this.isSetTiercategoryMap();
    boolean that_present_tiercategoryMap = true && that.isSetTiercategoryMap();
    if (this_present_tiercategoryMap || that_present_tiercategoryMap) {
      if (!(this_present_tiercategoryMap && that_present_tiercategoryMap))
        return false;
      if (!this.tiercategoryMap.equals(that.tiercategoryMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_version = true;
    builder.append(present_version);
    if (present_version)
      builder.append(version);

    boolean present_gender = true && (isSetGender());
    builder.append(present_gender);
    if (present_gender)
      builder.append(gender);

    boolean present_agerange = true && (isSetAgerange());
    builder.append(present_agerange);
    if (present_agerange)
      builder.append(agerange);

    boolean present_tiercategoryMap = true && (isSetTiercategoryMap());
    builder.append(present_tiercategoryMap);
    if (present_tiercategoryMap)
      builder.append(tiercategoryMap);

    return builder.toHashCode();
  }

  public int compareTo(AudienceSegment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AudienceSegment typedOther = (AudienceSegment)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGender()).compareTo(typedOther.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, typedOther.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAgerange()).compareTo(typedOther.isSetAgerange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgerange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agerange, typedOther.agerange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTiercategoryMap()).compareTo(typedOther.isSetTiercategoryMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTiercategoryMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tiercategoryMap, typedOther.tiercategoryMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AudienceSegment(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (isSetGender()) {
      if (!first) sb.append(", ");
      sb.append("gender:");
      sb.append(this.gender);
      first = false;
    }
    if (isSetAgerange()) {
      if (!first) sb.append(", ");
      sb.append("agerange:");
      sb.append(this.agerange);
      first = false;
    }
    if (isSetTiercategoryMap()) {
      if (!first) sb.append(", ");
      sb.append("tiercategoryMap:");
      if (this.tiercategoryMap == null) {
        sb.append("null");
      } else {
        sb.append(this.tiercategoryMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AudienceSegmentStandardSchemeFactory implements SchemeFactory {
    public AudienceSegmentStandardScheme getScheme() {
      return new AudienceSegmentStandardScheme();
    }
  }

  private static class AudienceSegmentStandardScheme extends StandardScheme<AudienceSegment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AudienceSegment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.version = iprot.readByte();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.gender = iprot.readI32();
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGERANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.agerange = iprot.readI32();
              struct.setAgerangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIERCATEGORY_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.tiercategoryMap = new HashMap<Integer,AudienceCategory>(2*_map8.size);
                for (int _i9 = 0; _i9 < _map8.size; ++_i9)
                {
                  int _key10; // required
                  AudienceCategory _val11; // required
                  _key10 = iprot.readI32();
                  _val11 = new AudienceCategory();
                  _val11.read(iprot);
                  struct.tiercategoryMap.put(_key10, _val11);
                }
                iprot.readMapEnd();
              }
              struct.setTiercategoryMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AudienceSegment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeByte(struct.version);
      oprot.writeFieldEnd();
      if (struct.isSetGender()) {
        oprot.writeFieldBegin(GENDER_FIELD_DESC);
        oprot.writeI32(struct.gender);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAgerange()) {
        oprot.writeFieldBegin(AGERANGE_FIELD_DESC);
        oprot.writeI32(struct.agerange);
        oprot.writeFieldEnd();
      }
      if (struct.tiercategoryMap != null) {
        if (struct.isSetTiercategoryMap()) {
          oprot.writeFieldBegin(TIERCATEGORY_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.tiercategoryMap.size()));
            for (Map.Entry<Integer, AudienceCategory> _iter12 : struct.tiercategoryMap.entrySet())
            {
              oprot.writeI32(_iter12.getKey());
              _iter12.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AudienceSegmentTupleSchemeFactory implements SchemeFactory {
    public AudienceSegmentTupleScheme getScheme() {
      return new AudienceSegmentTupleScheme();
    }
  }

  private static class AudienceSegmentTupleScheme extends TupleScheme<AudienceSegment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AudienceSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetGender()) {
        optionals.set(1);
      }
      if (struct.isSetAgerange()) {
        optionals.set(2);
      }
      if (struct.isSetTiercategoryMap()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetVersion()) {
        oprot.writeByte(struct.version);
      }
      if (struct.isSetGender()) {
        oprot.writeI32(struct.gender);
      }
      if (struct.isSetAgerange()) {
        oprot.writeI32(struct.agerange);
      }
      if (struct.isSetTiercategoryMap()) {
        {
          oprot.writeI32(struct.tiercategoryMap.size());
          for (Map.Entry<Integer, AudienceCategory> _iter13 : struct.tiercategoryMap.entrySet())
          {
            oprot.writeI32(_iter13.getKey());
            _iter13.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AudienceSegment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.version = iprot.readByte();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.gender = iprot.readI32();
        struct.setGenderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.agerange = iprot.readI32();
        struct.setAgerangeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tiercategoryMap = new HashMap<Integer,AudienceCategory>(2*_map14.size);
          for (int _i15 = 0; _i15 < _map14.size; ++_i15)
          {
            int _key16; // required
            AudienceCategory _val17; // required
            _key16 = iprot.readI32();
            _val17 = new AudienceCategory();
            _val17.read(iprot);
            struct.tiercategoryMap.put(_key16, _val17);
          }
        }
        struct.setTiercategoryMapIsSet(true);
      }
    }
  }

}

