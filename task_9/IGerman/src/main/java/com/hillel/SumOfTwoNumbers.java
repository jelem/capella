package com.hillel;

public class SumOfTwoNumbers {

  public static boolean ifArrayContainsSum(int[] ar, int n) {
    int sum;
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar.length; j++) {
        if (i != j) {
          sum = ar[i] + ar[j];
          if (sum == n) {
            return true;

          }
        }
      }
    }
    return false;
  }
}


