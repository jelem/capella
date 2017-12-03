package com.hillel;

public class PascalTriangle {

  public static int[][] build(int n) {
    if (n < 2) {
      return null;
    }

    int[][] array = new int[n][];

    for (int i = 0; i < array.length; i++) {
      array[i] = new int[i + 1];

      array[i][0] = 1;
      array[i][i] = 1;

      for (int j = 1; j < array[i].length - 1; j++) {
        array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
      }
    }
    return array;
  }
}
