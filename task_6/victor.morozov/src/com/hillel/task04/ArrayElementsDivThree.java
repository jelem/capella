package com.hillel.task04;

import java.util.Scanner;

public class ArrayElementsDivThree {

  public static void main(String[] args) {
    System.out.println("4. Выведите элементы массива, которые делятся на 3 без остатка");
    int n = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Введите кол-во элементов массива N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] array = ArrayInit(n);

    System.out.println(ArrayToString(array));

    ElementsDivThree(array);
  }

  private static void ElementsDivThree(int[] array) {
    System.out.println("Элементы массива, которые делятся на 3 без остатка");
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0) {
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
