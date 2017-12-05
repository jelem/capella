package com.hillel;

public class Homework9 {

  public static int[] twoArrayToThirdAsc(int[] first, int[] second) {
    int[] third = new int[first.length + second.length];
    int ifirst = 0, isecond = 0, ithird = 0;

    while (ithird < third.length) {
      if (ifirst < first.length && isecond < second.length) {
        if (first[ifirst] < second[isecond]) {
          third[ithird] = first[ifirst];
          ithird++;
          ifirst++;
        } else {
          third[ithird] = second[isecond];
          ithird++;
          isecond++;
        }
        continue;
      }

      if (ifirst < first.length && isecond == second.length) {
        third[ithird] = first[ifirst];
        ithird++;
        ifirst++;
        continue;
      }

      if (ifirst == first.length && isecond < second.length) {
        third[ithird] = second[isecond];
        ithird++;
        isecond++;
      }
    }
    return third;
  }

  public static boolean searchSumInArray(int sum, int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] >= sum || array[j] >= sum) {
          break;
        }
        if (sum < array[i] + array[j]) {
          break;
        }
        if (sum == array[i] + array[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void printArray(int[] array) {
    for (int elem : array) {
      System.out.print(elem + " ");
    }
  }

}
