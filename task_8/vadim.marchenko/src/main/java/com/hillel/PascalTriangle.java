package com.hillel;

public class PascalTriangle {

  public static void main(String[] args) {
    printTriangle(createPascalTriangle());
  }

  public static int[][] createPascalTriangle() {
    int numberOfRows = 6;
    int[][] triangle = new int[numberOfRows][];
    for (int i = 0; i < numberOfRows; i++) {
      triangle[i] = new int[i + 1];
    }

    for (int i = 0; i < numberOfRows; i++) {
      triangle[i][0] = 1;
      triangle[i][i] = 1;
    }

    for (int i = 2; i < numberOfRows; i++) {
      for (int j = 1; j < triangle[i].length - 1; j++) {
        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
      }
    }
    return triangle;
  }

  public static void printTriangle(int[][] triangle) {
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        System.out.print(triangle[i][j] + " ");
      }
      System.out.println();
    }
  }
}
