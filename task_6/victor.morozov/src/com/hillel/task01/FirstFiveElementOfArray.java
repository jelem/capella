package com.hillel.task01;

public class FirstFiveElementOfArray {

  public static void main(String[] args) {
    int[] array = new int[10];

    arrayInit(array);

    arrayPrint(array, 5);
  }
  private static void arrayInit (int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    System.out.print("Init array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  private static void arrayPrint (int[] array, int index) {
    if (index < array.length) {
      System.out.print("First " + index + " elements: ");
      for (int i = 0; i < index; i++) {
        System.out.print(array[i] + " ");
      }
    }
  }
}