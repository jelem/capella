package com.hillel;

import java.util.Scanner;

public class Homework6 {

  private static TaskFourPlus taskFourPlus = new TaskFourPlus();

  public static void main(String[] args) {
    while (true) {
      selectTaskNumber();
    }
  }

  private static void selectTaskNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter task number: ");
    byte task = scanner.nextByte();
    switch (task) {
      case 1:
        task1();
        break;
      case 2:
        task2();
        break;
      case 3:
        task3();
        break;
      case 4:
        taskFourPlus.printDivThreeElements();
        break;
      case 5:
        taskFourPlus.printEvenElements();
        break;
      case 6:
        System.out.println("Arrays sum is: " + taskFourPlus.arraySum());
        break;
      case 7:
        System.out.println("Average is: " + taskFourPlus.arrayAverage());
        break;
      case 8:
        System.out.println("Minimum + Maximum = " + taskFourPlus.sumMinMax());
        break;
      case 9:
        System.out.println("Multiplication of Unevens is: " + taskFourPlus.mulOfUneven());
        break;
      case 10:
        task10();
        break;
      default:
        System.out.println("Incorrect task's number");
        selectTaskNumber();
    }
  }

  private static void task1() {
    int[] array = new int[10];
    array = fillArray(array);
    printFirstFiveElements(array);
  }

  private static void task2() {
    int[] array = createArrayWithEnteredLength();
    fillArrayFromOneToN(array);
    printArray(array);
  }

  private static void task3() {
    int[] array = createArrayWithEnteredLength();
    fillArrayFromNToOne(array);
    printArray(array);
  }

  private static void task10() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter element: ");
    int element = scanner.nextInt();
    if (taskFourPlus.elementIsIn(element)) {
      int index = taskFourPlus.findIndex(element);
      System.out.println("Index of " + element + " is " + index);
    } else {
      System.out.println("Element isn't in array");
    }
  }

  private static int[] fillArray(int[] array) {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.print("Enter element " + i + ": ");
      array[i] = scanner.nextInt();
    }
    return array;
  }

  private static void printFirstFiveElements(int[] array) {
    for (int i = 0; i < 5; i++) {
      System.out.println(array[i]);
    }
  }

  private static int[] createArrayWithEnteredLength() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter array's length: ");
    byte len = scanner.nextByte();
    return new int[len];
  }

  private static void fillArrayFromOneToN(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
  }

  private static void fillArrayFromNToOne(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = array.length - i;
    }
  }

  private static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }
}