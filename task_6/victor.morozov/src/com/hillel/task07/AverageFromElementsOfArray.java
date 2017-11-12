package com.hillel.task07;

import java.util.Scanner;

public class AverageFromElementsOfArray {
  public static void main(String[] args) {
    System.out.println("7. Найдите среднее арифметическое элементов массива");

    int[] array = ArrayInit();

    System.out.println(ArrayToString(array));

    System.out.println("Среднее арифметическое элементов массива: " + ArrayAverageElements(array));
  }

  private static int ArrayAverageElements(int[] array) {
    int sum = 0;
    for (int elem : array) {
      sum += elem;
    }
    return sum / array.length;
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
