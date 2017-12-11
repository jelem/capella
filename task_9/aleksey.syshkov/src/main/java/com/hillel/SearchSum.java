package com.hillel;

public class SearchSum {

  public static boolean seeker(int[] arr, int sum) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length; j++) {
        if ((i < j) && (arr[i] + arr[j] == sum)) {
          return true;
        }
      }
    }
    return false;
  }
}
