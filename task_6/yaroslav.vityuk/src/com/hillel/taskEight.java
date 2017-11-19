package com.hillel;

public class taskEight {

  public static void main(String[] args) {
    int[] array = new int[10];
    int max = 0;
    int min = 100;
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40));
      System.out.println(array[i]);
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    System.out.println("Sum of max + min is: " + (max + min));
  }
}
