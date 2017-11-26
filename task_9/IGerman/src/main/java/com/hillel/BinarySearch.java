package com.hillel;

public class BinarySearch {

  public static boolean findNumberOptimized(int[] ar, int n) {

    int start = 0;
    int end = ar.length;
    if (n > ar[end - 1]) {
      return false;
    }

    while (start <= end) {
      int middle = (start + end) / 2;
      int element = ar[middle];

      if (n == element) {
        return true;
      } else if (n > element) {
        start = middle + 1;
      } else if (n < element) {
        end = middle - 1;
      }
    }
    return false;
  }
}
