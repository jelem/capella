package com.hillel;

public class PascalTriangle {

  public static int[][] arrayInput (int rows) {
    int[][] triangle = new int[rows][];
    triangle[0] = new int[1];
    triangle[0][0] = 1;
    for (int i = 1; i < triangle.length; i++) {
      triangle[i] = new int[i+1];
      triangle[i][0] = 1;
      triangle[i][i] = 1;
      for (int j = 1; j < i - 1; j++) {
        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
      }
    }

    return triangle;
  }

  public static void arrayPrint (int[][] triangle) {
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        System.out.print(triangle[i][j] + " ");
      }
      System.out.println();
    }
  }

}
