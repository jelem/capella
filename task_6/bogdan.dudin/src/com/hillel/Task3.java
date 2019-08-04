package com.hillel;

import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n;

    do {
      System.out.print("Enter N elements of array: ");
      n = scanner.nextInt();
    } while (n < 1);

    int[] array = new int[n];

    System.out.print("Your array: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = n;
      System.out.print(array[i] + " ");
      n--;
    }
  }
}
