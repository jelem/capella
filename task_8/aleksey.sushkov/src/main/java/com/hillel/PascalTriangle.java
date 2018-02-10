package com.hillel;


import java.util.Scanner;

public class PascalTriangle {

  public static void main(String[] args) {

    int rows = 0;
    System.out.println("Enter number of rows:");

    Scanner scanner = new Scanner(System.in);
    rows = scanner.nextInt();

    int [][] arr = new int [rows][];
    arr[0] = new int [1];
    arr[1] = new int [2];
    arr[0][0] = 1;
    arr[1][0] = 1;
    arr[1][1] = 1;
    System.out.println(arr[0][0]);
    System.out.println(arr[1][0] + " " + arr[1][1]);
    for (int i = 2; i < rows; i++)
    {
      arr[i] = new int [i+1];
      arr[i][0] = 1;
      System.out.print(arr[i][0] + " ");
      for (int j = 1; j < i; j++)
      {
        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
        System.out.print(arr[i][j] + " ");
      }
      arr[i][i] = 1;
      System.out.println(arr[i][i]);
    }
  }

}