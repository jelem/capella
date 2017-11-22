package com.hillel.task07;

import java.util.Scanner;

public class AverageFromElementsOfArray {
  public static void main(String[] args) {
    System.out.println("7. Найдите среднее арифметическое элементов массива");

    int[] array = arrayInit();

    System.out.println(arrayToString(array));

    System.out.println("Среднее арифметическое элементов массива: " + arrayAverageElements(array));
  }

  private static int arrayAverageElements(int[] array) {
    int sum = 0;
    for (int elem : array) {
      sum += elem;
    }
    return sum / array.length;
  }

  private static String arrayToString(int[] array) {
    String str = "";
    for(int i = 0; i < array.length; ++i) {
      str = str + array[i] + " ";
    }
    return str;
  }

  private static int[] arrayInit() {
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
