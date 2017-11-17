package com.hillel.task10;

import java.util.Scanner;

public class IndexElementNOfArray {

  public static void main(String[] args) {
    System.out.println("10. Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение");

    int[] array = arrayInit();

    int n = inputN();

    System.out.println();
    System.out.println(indexElement(array, n));
  }

  private static String indexElement(int[] array, int n) {
    String index = "";
    for (int i = 0; i < array.length; i++) {
      if (n == array[i]) {
        index += i + " ";
      }
    }
    if (index == "") {
      return "В массиве отсутствует элемент " + n;
    } else {
      return "Индекс(ы) элемента " + n + ": " + index;
    }
  }

  private static int inputN() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите искомый элемент: ");
    int result = scanner.nextInt();

    return result;
  }

  private static int[] arrayInit() {
    int n = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Введите кол-во элементов массива (>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] arr = new int[n];

    for(int i = 0; i < arr.length; i++) {
      System.out.print("[" + i + "] = ");
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

}
