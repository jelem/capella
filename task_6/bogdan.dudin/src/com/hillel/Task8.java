package com.hillel;

public class Task8 {

  public static void main(String[] args) {

    int[] array = {47, 34, 41, 48, 26, 57, 44, 21, 27, 17,
        9, 11, 30, 14, 29, 36, 1, 49, 5, 20, 50,
        56, 63, 61, 16, 58, 59, 43, 24, 38};

    int min = array[0], max = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    System.out.println("Sum min & max of elements of an array: " + (min + max));
  }
}
