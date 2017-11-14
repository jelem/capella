package com.hillel;

public class taskNine {

  public static void main(String[] args) {
    int[] array = new int[5];
    int multipl = 1;
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 20) - 10);
      System.out.println(array[i]);
      if (array[i] % 2 != 0) {
        multipl *= array[i];
      }
    }
    System.out.println("Multiplication = " + multipl);
  }
}
