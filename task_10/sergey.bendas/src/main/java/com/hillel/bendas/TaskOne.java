package com.hillel.bendas;

public class TaskOne {

  public static String changeEmail(String str) {
    return str.replace("@", "[ at ]").replace(".", "[ dot ]");
  }
}
