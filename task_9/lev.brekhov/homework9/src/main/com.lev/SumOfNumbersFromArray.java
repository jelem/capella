package com.lev;

public class SumOfNumbersFromArray {

  public static void main(String[] args) {
    int[] a = {1, 5, 7, 9, 12};
    int sum = Integer.parseInt(args[0]);

    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (sum == a[i] + a[j]) {
          System.out.println("Yea!");
        }
      }
    }
  }
}