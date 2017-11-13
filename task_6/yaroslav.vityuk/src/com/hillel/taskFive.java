package com.hillel;

public class taskFive {

  public static void main(String[] args) {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40));
      if (array[i] % 2 == 0) {
        System.out.println(array[i]);
      }
    }
  }
}
