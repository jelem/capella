package com.dima.Triangle;

public class PascalTriangle {
  private int[][] matrix;

  public PascalTriangle() {
    matrix = null;
  }

  public PascalTriangle(int size) {
    build(size);
  }

  public void build(int size) {
    matrix = new int[size][];

    for (int i = 0; i < matrix.length; i++){
      matrix[i] = new int[i+1];
      matrix[i][0] = matrix[i][matrix[i].length -1] = 1;
    }

    rebuild();
  }


  public void rebuild() {
    for (int i = 2; i < matrix.length; i++){
      for (int j = 1; j < matrix[i].length - 1; j++){
        matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
      }
    }
  }

  public void show(){
    for (int i = 0; i < matrix.length; i++){
      for (int k = (2*matrix.length - 2*i)/2 ; k > 0; k--){
        System.out.print(" ");
      }
      for (int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
