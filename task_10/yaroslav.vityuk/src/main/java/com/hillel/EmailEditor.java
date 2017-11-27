package com.hillel;

public class EmailEditor {
  public static String editEmail(String str) {
    return str.replace("@", "[ at ]").replace(".", "[ dot ]");
  }
}