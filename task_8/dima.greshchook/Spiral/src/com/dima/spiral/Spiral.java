package com.dima.spiral;

public class Spiral {
  private int[][] matrix;
  private int iterator;
  private static final int RIGHT = 0;
  private static final int DOWN = 1;
  private static final int LEFT = 2;
  private static final int UP = 3;
  private static final int DEFAULT = -1;

  public Spiral() {
    matrix = null;
    iterator = 1;
  }

  public Spiral(int size) {
    iterator = 1;
    build(size);
  }

  public void build(int size) {
    matrix = new int[size][size];

    int direct = RIGHT;
    int df = 0;
    for (int i = 0; i < size * 2 - 1; i++){
      if (direct == RIGHT){
        right(df);
        direct = DOWN;
        df++;
        continue;
      }if (direct == DOWN){
        down(df);
        direct = LEFT;
        continue;
      }if (direct == LEFT){
        left(df);
        direct = UP;
        continue;
      }if (direct == UP){
        up(df);
        direct = RIGHT;
        continue;
      }
    }
  }

  public void right(int time){
    for (int i = 0 + time; i <= matrix.length - 1 - time; i++){
      matrix[time][i] = iterator++;
    }
  }

  public void down(int time){
    for (int i = 0 + time; i <= matrix.length - time; i++){
      matrix[i][matrix.length - time] = iterator++;
    }
  }

  public void left(int time){
    for (int i = matrix.length - time - 1; i >= 0 + time - 1; i--){
      matrix[matrix.length - time][i] = iterator++;
    }
  }

  public void up(int time){
    for (int i = matrix.length - time - 1 ; i >= 0 + time; i--){
      matrix[i][time - 1] = iterator++;
    }
  }

  public void show(){
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
