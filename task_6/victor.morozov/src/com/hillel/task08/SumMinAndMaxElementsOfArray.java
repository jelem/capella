package com.hillel.task08;

import java.util.Scanner;

public class SumMinAndMaxElementsOfArray {
  public static void main(String[] args) {
    System.out.println("8. Определите сумму минимального и максимального элементов массива");

    int[] array = ArrayInit();

    System.out.println(ArrayToString(array));

    System.out.println("Сумма минимального и максимального элементов массива: " + (MinOfArray(array) + MaxOfArray(array)));
  }

  private static int MaxOfArray(int[] array) {
    int max = array[0];
    for (int elem : array) {
      if (max < elem) {
        max = elem;
      }
    }
    return max;
  }

  private static int MinOfArray(int[] array) {
    int min = array[0];
    for (int elem : array) {
      if (min > elem) {
        min = elem;
      }
    }
    return min;
  }

  private static String ArrayToString(int[] array) {
    String str = "";
    for(int i = 0; i < array.length; ++i) {
      str = str + array[i] + " ";
    }
    return str;
  }

  private static int[] ArrayInit() {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Введите кол-во элементов массива N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }
}
