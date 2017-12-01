package com.hillel;

public class TryPaskal {

  public static int[][] printPaskal(int size) {
    int[][] paskalArray = new int[size][];

    for (int i = 0; i < size; i++) {
      int[] columnsArray = new int[i + 1];
      paskalArray[i] = columnsArray;
      if (i > 0) {
        for (int j = 0; j < paskalArray[i].length; j++) {
          if (j > 0 && j < paskalArray[i].length - 1) {
            paskalArray[i][j] = paskalArray[i - 1][j] + paskalArray[i - 1][j - 1];
          } else {
            columnsArray[j] = 1;
          }
        }
      } else {
        columnsArray[i] = 1;
      }
    }

    for (int i = 0; i < paskalArray.length; i++) {
      System.out.print(i + " строка: ");
      for (int j = 0; j < paskalArray[i].length; j++) {
        System.out.print(paskalArray[i][j] + " ");
      }
      System.out.println();
    }
    return paskalArray;
  }
}

