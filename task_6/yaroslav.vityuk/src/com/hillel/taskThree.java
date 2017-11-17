package com.hillel;

import java.util.Scanner;

public class taskThree {

  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    System.out.println("Enter array's size: ");
    int arraySize = enter.nextInt();
    int[] array = new int[arraySize];
    int n = arraySize;

    for (int i = 0; i < arraySize; i++, n--) {
      array[i] = n;
      System.out.println(array[i]);
    }

  }

}
