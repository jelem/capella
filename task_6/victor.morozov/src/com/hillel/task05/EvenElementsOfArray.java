package com.hillel.task05;

import java.util.Scanner;

public class EvenElementsOfArray {
  public static void main(String[] args) {
    System.out.println("5. Выведите все четные элементы массива");
    int n = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Введите кол-во элементов массива N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] array = ArrayInit(n);

    System.out.println(ArrayToString(array));

    EvenElements(array);
  }

  private static void EvenElements(int[] array) {
    System.out.println("Четные элементы массива");
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i] + " ");
      }
    }
  }

  private static String ArrayToString(int[] array) {
    String str = "";

    for(int i = 0; i < array.length; ++i) {
      str = str + array[i] + " ";
    }
    return str;
  }

  private static int[] ArrayInit(int n) {
    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }

}
