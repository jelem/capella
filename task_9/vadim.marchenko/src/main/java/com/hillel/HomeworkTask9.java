package com.hillel;

import java.util.Arrays;

public class HomeworkTask9 {

  public static void main(String[] args) {
    int[] array1 = {1, 3, 5};
    int[] array2 = {2, 4, 8, 9, 12};
  }

  public static int[] sortArrays(int[] array1, int[] array2) {
    int[] newArray = new int[array1.length + array2.length];
    System.arraycopy(array1, 0, newArray, 0, array1.length);
    System.arraycopy(array2, 0, newArray, array1.length, array2.length);
    Arrays.sort(newArray);
    return newArray;
  }

  public static boolean checkElementsSum(int[] array, int searchSum) {
    int actualSum;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        actualSum = array[i] + array[j];
        if (searchSum == actualSum) {
          return true;
        }
      }
    }
    return false;
  }
}
