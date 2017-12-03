package com.hillel;

public class Task4 {

  public static void main(String[] args) {

    int[] array = {47, 34, 41, 48, 26, 57, 44, 21, 27, 17,
        9, 11, 30, 14, 29, 36, 1, 49, 5, 20, 50,
        56, 63, 61, 16, 58, 59, 43, 24, 38};

    System.out.print("Elements of an array that divide by 3 without residue: ");

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0) {
        System.out.print(array[i] + " ");
      }
    }
  }
}
