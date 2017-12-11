package com.hillel;

public class ReplaceInStrings {

  public static String replaceInString(String string) {

    String newString = string.replace("@", "[ at ]").replace(".", "[ dot ]");

    return newString;
  }
}
