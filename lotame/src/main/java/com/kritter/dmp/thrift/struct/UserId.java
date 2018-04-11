/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.kritter.dmp.thrift.struct;

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

public class UserId implements org.apache.thrift.TBase<UserId, UserId._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserId");

  private static final org.apache.thrift.protocol.TField TYPE_ID_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("typeIdMap", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserIdTupleSchemeFactory());
  }

  public Map<UIDType,String> typeIdMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE_ID_MAP((short)1, "typeIdMap");

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
        case 1: // TYPE_ID_MAP
          return TYPE_ID_MAP;
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
  private _Fields optionals[] = {_Fields.TYPE_ID_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE_ID_MAP, new org.apache.thrift.meta_data.FieldMetaData("typeIdMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, UIDType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserId.class, metaDataMap);
  }

  public UserId() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserId(UserId other) {
    if (other.isSetTypeIdMap()) {
      Map<UIDType,String> __this__typeIdMap = new HashMap<UIDType,String>();
      for (Map.Entry<UIDType, String> other_element : other.typeIdMap.entrySet()) {

        UIDType other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        UIDType __this__typeIdMap_copy_key = other_element_key;

        String __this__typeIdMap_copy_value = other_element_value;

        __this__typeIdMap.put(__this__typeIdMap_copy_key, __this__typeIdMap_copy_value);
      }
      this.typeIdMap = __this__typeIdMap;
    }
  }

  public UserId deepCopy() {
    return new UserId(this);
  }

  @Override
  public void clear() {
    this.typeIdMap = null;
  }

  public int getTypeIdMapSize() {
    return (this.typeIdMap == null) ? 0 : this.typeIdMap.size();
  }

  public void putToTypeIdMap(UIDType key, String val) {
    if (this.typeIdMap == null) {
      this.typeIdMap = new HashMap<UIDType,String>();
    }
    this.typeIdMap.put(key, val);
  }

  public Map<UIDType,String> getTypeIdMap() {
    return this.typeIdMap;
  }

  public UserId setTypeIdMap(Map<UIDType,String> typeIdMap) {
    this.typeIdMap = typeIdMap;
    return this;
  }

  public void unsetTypeIdMap() {
    this.typeIdMap = null;
  }

  /** Returns true if field typeIdMap is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeIdMap() {
    return this.typeIdMap != null;
  }

  public void setTypeIdMapIsSet(boolean value) {
    if (!value) {
      this.typeIdMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE_ID_MAP:
      if (value == null) {
        unsetTypeIdMap();
      } else {
        setTypeIdMap((Map<UIDType,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE_ID_MAP:
      return getTypeIdMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE_ID_MAP:
      return isSetTypeIdMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserId)
      return this.equals((UserId)that);
    return false;
  }

  public boolean equals(UserId that) {
    if (that == null)
      return false;

    boolean this_present_typeIdMap = true && this.isSetTypeIdMap();
    boolean that_present_typeIdMap = true && that.isSetTypeIdMap();
    if (this_present_typeIdMap || that_present_typeIdMap) {
      if (!(this_present_typeIdMap && that_present_typeIdMap))
        return false;
      if (!this.typeIdMap.equals(that.typeIdMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_typeIdMap = true && (isSetTypeIdMap());
    builder.append(present_typeIdMap);
    if (present_typeIdMap)
      builder.append(typeIdMap);

    return builder.toHashCode();
  }

  public int compareTo(UserId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UserId typedOther = (UserId)other;

    lastComparison = Boolean.valueOf(isSetTypeIdMap()).compareTo(typedOther.isSetTypeIdMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeIdMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeIdMap, typedOther.typeIdMap);
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
    StringBuilder sb = new StringBuilder("UserId(");
    boolean first = true;

    if (isSetTypeIdMap()) {
      sb.append("typeIdMap:");
      if (this.typeIdMap == null) {
        sb.append("null");
      } else {
        sb.append(this.typeIdMap);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserIdStandardSchemeFactory implements SchemeFactory {
    public UserIdStandardScheme getScheme() {
      return new UserIdStandardScheme();
    }
  }

  private static class UserIdStandardScheme extends StandardScheme<UserId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE_ID_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.typeIdMap = new HashMap<UIDType,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  UIDType _key2; // required
                  String _val3; // required
                  _key2 = UIDType.findByValue(iprot.readI32());
                  _val3 = iprot.readString();
                  struct.typeIdMap.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setTypeIdMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.typeIdMap != null) {
        if (struct.isSetTypeIdMap()) {
          oprot.writeFieldBegin(TYPE_ID_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.typeIdMap.size()));
            for (Map.Entry<UIDType, String> _iter4 : struct.typeIdMap.entrySet())
            {
              oprot.writeI32(_iter4.getKey().getValue());
              oprot.writeString(_iter4.getValue());
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

  private static class UserIdTupleSchemeFactory implements SchemeFactory {
    public UserIdTupleScheme getScheme() {
      return new UserIdTupleScheme();
    }
  }

  private static class UserIdTupleScheme extends TupleScheme<UserId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTypeIdMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTypeIdMap()) {
        {
          oprot.writeI32(struct.typeIdMap.size());
          for (Map.Entry<UIDType, String> _iter5 : struct.typeIdMap.entrySet())
          {
            oprot.writeI32(_iter5.getKey().getValue());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.typeIdMap = new HashMap<UIDType,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            UIDType _key8; // required
            String _val9; // required
            _key8 = UIDType.findByValue(iprot.readI32());
            _val9 = iprot.readString();
            struct.typeIdMap.put(_key8, _val9);
          }
        }
        struct.setTypeIdMapIsSet(true);
      }
    }
  }

}

