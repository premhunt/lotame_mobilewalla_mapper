/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.kritter.dmp.thrift.struct;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AudType implements org.apache.thrift.TEnum {
  Gender(1),
  AgeRange(2),
  Interest(3),
  Category(4),
  Branch(5),
  MaritalStatus(6),
  IncomeClass(7),
  Ethnicity(8);

  private final int value;

  private AudType(int value) {
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
  public static AudType findByValue(int value) { 
    switch (value) {
      case 1:
        return Gender;
      case 2:
        return AgeRange;
      case 3:
        return Interest;
      case 4:
        return Category;
      case 5:
        return Branch;
      case 6:
        return MaritalStatus;
      case 7:
        return IncomeClass;
      case 8:
        return Ethnicity;
      default:
        return null;
    }
  }
}
