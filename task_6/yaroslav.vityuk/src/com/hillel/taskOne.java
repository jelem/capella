package com.hillel;

public class taskOne {

  public static void main(String[] args) {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40) - 20);
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(array[i]);
    }
  }

}
