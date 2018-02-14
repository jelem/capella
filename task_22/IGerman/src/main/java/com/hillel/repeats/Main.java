package com.hillel.repeats;

public class Main {

  public static void main(String[] args) {

    RepeatsHashMap hashMap = new RepeatsHashMap();
    System.out.println(hashMap.getRepeats("string"));
    System.out.println(hashMap.getRepeats("stringg"));
    System.out.println(hashMap.getRepeats("Congradulations"));
    System.out.println(hashMap.getRepeats("zuma"));
  }
}
