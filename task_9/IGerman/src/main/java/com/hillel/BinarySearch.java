package com.hillel;

public class BinarySearch {

  public static boolean findNumberOptimized(int[] ar, int nb) {

    int start = 0;
    int end = ar.length;
    if (nb > ar[end - 1]) {
      return false;
    }

    while (start <= end) {
      int middle = (start + end) >>> 1;
      int element = ar[middle];

      if (nb == element) {
        return true;
      } else if (nb > element) {
        start = middle + 1;
      } else if (nb < element) {
        end = middle - 1;
      }
    }
    return false;
  }
}
