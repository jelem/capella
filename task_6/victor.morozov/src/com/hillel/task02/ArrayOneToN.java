package com.hillel.task02;

import java.util.Scanner;

public class ArrayOneToN {

  public static void main(String[] args) {
    System.out.println("2. Создайте массив размером n, элементами, которого будут числа от 1 до n");
    int n = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Input N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] array = arrayInit(n);

    System.out.print(arrayToString(array));
  }
  private static int[] arrayInit(int n) {
    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }

  private static String arrayToString(int[] arr) {
    String str = "";

    for(int i = 0; i < arr.length; ++i) {
      str = str + arr[i] + " ";
    }

    return str;
  }
}

