package com.hillel;

public class ThreeArrays {

  public static int[] superArray(int[] arr1, int[] arr2) {
    int[] resultarr = new int[arr1.length + arr2.length];

    int count1 = 0;
    int count2 = 0;
    while (count1 + count2 < resultarr.length) {
      if (count2 == arr2.length || count1 != arr1.length && arr1[count1] < arr2[count2]) {
        resultarr[count1 + count2] = arr1[count1];
        count1++;
      } else {
        resultarr[count1 + count2] = arr2[count2];
        count2++;
      }
    }
    return resultarr;
  }
}
