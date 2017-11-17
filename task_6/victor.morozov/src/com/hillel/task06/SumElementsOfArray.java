package com.hillel.task06;

import java.util.Scanner;

public class SumElementsOfArray {
  public static void main(String[] args) {
    System.out.println("6. Найдите сумму элементов массива");

    int[] array = arrayInit();

    System.out.println(arrayToString(array));

    System.out.println("Сумма элементов массива: " + arraySumElements(array));
  }

  private static int arraySumElements(int[] array) {
    int sum = 0;
    for (int elem : array) {
      sum += elem;
    }
    return sum;
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
