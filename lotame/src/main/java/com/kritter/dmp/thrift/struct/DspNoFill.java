/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.kritter.adserving.thrift.struct;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DspNoFill implements org.apache.thrift.TEnum {
  FILL(1),
  TIMEOUT(2),
  RESPERROR(3),
  LOWBID(4),
  FLOORUNMET(5),
  EMPTY_RESPONSE(6);

  private final int value;

  private DspNoFill(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static DspNoFill findByValue(int value) { 
    switch (value) {
      case 1:
        return FILL;
      case 2:
        return TIMEOUT;
      case 3:
        return RESPERROR;
      case 4:
        return LOWBID;
      case 5:
        return FLOORUNMET;
      case 6:
        return EMPTY_RESPONSE;
      default:
        return null;
    }
  }
}
