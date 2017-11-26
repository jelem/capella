package com.hillel;

public class SpiralArray {

  public static int[][] initArray(int a, int b) {
    int[][] ar = new int[a][b];
    int x = 0;
    int y = 0;
    int count = 0;

    while ((x < a) & (y < b)) {

      for (int j = y; j < b; j++) {
        if (ar[x][j] == 0) {
          ar[x][j] = count++;
        }
      }
      x++;
      b--;
      for (int i = x; i < a; i++) {
        if (ar[i][b] == 0) {
          ar[i][b] = count++;
        }
      }
      a--;
      for (int j = b; j > 0; j--) {
        if (ar[a][j - 1] == 0) {
          ar[a][j - 1] = count++;
        }
      }

      for (int i = a; i > 1; i--) {
        if (ar[i - 1][y] == 0) {
          ar[i - 1][y] = count++;
        }
      }
      y++;
    }
    return ar;
  }
}
