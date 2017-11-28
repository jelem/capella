package com.dima;

public class WrapperForMethods {

  public static String convertToBrief(String str) {

    int length  = str.length();
    if (length < 4) {
      return str;
    }
    String tmp = "";
    tmp += str.charAt(0) + String.valueOf(length - 2) + str.charAt(length - 1);
    return tmp;
  }

  public static String[] splitAndConvertToBrief(String str) {
    String[] array = str.split(" ");
    for (int i = 0; i < array.length; i++) {
      array[i] = convertToBrief(array[i]);
    }
    return array;
  }
}
