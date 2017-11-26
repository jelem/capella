package com.hillel.task03;

import java.util.Scanner;

public class ArrayNToOne {

  public static void main(String[] args) {
    System.out.println("3. Создайте массив размером n, элементами которого будут числа от n до 1");

    int n = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Input N(>0): ");
      n = scanner.nextInt();
    } while (n <= 0);

    int[] array = arrayInit(n);

    System.out.print(arrayToStr(array));
  }

  private static String arrayToStr(int[] array) {
    String str = "";
    for (int i = 0; i < array.length; i++) {
      str += array[i] + " ";
    }
    return str;
  }

  private static int[] arrayInit(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = n--;
    }
    return arr;
  }
}