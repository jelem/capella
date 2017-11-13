package com.hillel;

public class taskSix {

  public static void main(String[] args) {
    int[] array = new int[5];
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40));
      System.out.println(array[i]);
      sum += array[i];
    }
    System.out.println("Sum is: " + sum);
  }
}
