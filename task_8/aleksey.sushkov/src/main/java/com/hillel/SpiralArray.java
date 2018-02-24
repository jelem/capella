package com.hillel;

import java.util.Scanner;

public class SpiralArray {

  public static void main(String[] args) {

    int size = 0;
    System.out.println("Enter size of array:");

    Scanner scanner = new Scanner(System.in, "UTF-8");
    size = scanner.nextInt();
    int[][] arr = new int[size][size];

    int dimx = 0;
    int dimy = 0;
    int dimx1 = 1;
    int dimy1 = 0;
    int ch = 0;
    int visits = size;

    for (int i = 1; i <= size * size; i++) {
      arr[dimx][dimy] = i;
      if ((--visits) == 0) {
        visits = size * (ch % 2) + size * ((ch + 1) % 2) - (ch / 2 - 1) - 2;
        int temp = dimx1;
        dimx1 = - dimy1;
        dimy1 = temp;
        ch++;
      }
      dimy += dimx1;
      dimx += dimy1;
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
