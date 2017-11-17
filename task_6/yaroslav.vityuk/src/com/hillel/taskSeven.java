package com.hillel;

public class taskSeven {

  public static void main(String[] args) {
    int[] array = new int[10];
    double average = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40));
      System.out.println(array[i]);
      average += array[i];
    }
    System.out.println("Average is: " + average / array.length);
  }
}
