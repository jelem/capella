package com.hillel;

public class SpiralArray {

  public static void arrayPrint(int[][] array) {
    for (int[] anArray : array) {
      for (int elem : anArray) {
        System.out.format("%4d", elem);
      }
      System.out.println();
    }
  }

  public static int[][] arrayInit(int n) {
    int length = (int) Math.ceil(Math.sqrt(n));
    int[][] array = new int[length][length];

    return array;
  }

  public static int[][] fillArraySpiral(int[][] array, int n) {
    int counter = 1;
    int irow1 = 0;
    int irow2 = array.length - 1;
    int icol1 = 0;
    int icol2 = array[0].length - 1;

    while (counter <= n) {
      for (int i = icol1; i <= icol2; i++) {
        array[irow1][i] = counter++;
        if (counter > n) {
          return array;
        }
      }
      irow1++;

      for (int i = irow1; i <= irow2; i++) {
        array[i][icol2] = counter++;
        if (counter > n) {
          return array;
        }
      }
      icol2--;

      for (int i = icol2; i >= icol1; i--) {
        array[irow2][i] = counter++;
        if (counter > n) {
          return array;
        }
      }
      irow2--;

      for (int i = irow2; i >= irow1; i--) {
        array[i][icol1] = counter++;
        if (counter > n) {
          return array;
        }
      }
      icol1++;
    }
    return array;
  }
}