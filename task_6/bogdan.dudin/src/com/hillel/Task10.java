package com.hillel;

import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] array = {47, 34, 41, 48, 26, 57, 44, 21, 27, 17,
        9, 11, 30, 14, 29, 36, 1, 49, 5, 20, 50,
        56, 63, 61, 16, 58, 59, 43, 24, 38};

    System.out.print("Enter N: ");
    int n = scanner.nextInt();

    boolean k = false;

    for (int i = 0; i < array.length; i++) {
      if (n == array[i]) {
        System.out.println("Index: " + i);
        k = true;
        break;
      }
    }
    if (k == false) {
      System.out.println("Invalid N!");
    }
  }
}
