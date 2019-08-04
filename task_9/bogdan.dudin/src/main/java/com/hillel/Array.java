package com.hillel;

public class Array {

  public static int[] combine(int[] arrayOne, int[] arrayTwo) {
    int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

    int j = 0;
    int k = 0;

    while (j + k < arrayThree.length){
      if(arrayOne[j] < arrayTwo[k]) {
        arrayThree[j + k] = arrayOne[j++];
      }
      else {
        arrayThree[j + k] = arrayTwo[k++];
      }
      if (j >= arrayOne.length) {
        for (int i = j + k; i < arrayThree.length; i++) {
          arrayThree[i] = arrayTwo[k++];
        }
      }
      if (k >= arrayTwo.length) {
        for (int i = j + k; i < arrayThree.length; i++) {
          arrayThree[i] = arrayOne[j++];
        }
      }
    }
    return arrayThree;
  }

  public static boolean sumOfTwoElementsExist(int[] array, int sum) {
    int j = 0;
    int k = array.length - 1;

    while (j != k) {
      if (array[j] + array[k] < sum) {
        j++;
      }
      else if (array[j] + array[k] > sum) {
        k--;
      }
      else {
        return true;
      }
    }
    return false;
  }
}
