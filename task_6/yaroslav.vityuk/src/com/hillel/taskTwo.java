package com.hillel;

import java.util.Scanner;

public class taskTwo {

  public static void main(String[] args) {
    System.out.println("Enter array's size: ");
    Scanner enter = new Scanner(System.in);
    int arraySize = enter.nextInt();
    int[] array = new int[arraySize];

    for (int i = 0, a = 1; i < array.length; i++, a++) {
      array[i] = a;
      System.out.println(array[i]);
    }

  }

}
