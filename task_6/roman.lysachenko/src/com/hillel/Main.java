package com.hillel;

import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] array = new int[10];
    fillArrayRandom(array);
    int choice = 0;
    do {
      System.out.print("Enter task number: ");
      int choiceOfTask = scanner.nextInt();
      switch (choiceOfTask) {
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
          printArray(array);
          isDivideIntoThreeWithoutResidue(array);
          break;
        case 5:
          printArray(array);
          toPrintEvenElements(array);
          break;
        case 6:
          printArray(array);
          System.out.println("Sum of elements = " + sumOfArray(array));
          break;
        case 7:
          printArray(array);
          System.out.println("Average = " + averageOfArray(array));
          break;
        case 8:
          printArray(array);
          System.out.println("Sum max and min = " + sumMinimumAndMaximum(array));
          break;
        case 9:
          printArray(array);
          System.out.println("Composition of odd elements = " + compositionOfOddEllements(array));
          break;
        case 10:
          System.out.print("Enter number: ");
          int number = scanner.nextInt();
          printArray(array);
          foundElements(array, number);
          break;

        default:
          System.out.println("Enter wrong number!");
      }
      System.out.print("\nDo you want to change another task? (1 - YES, another - NO): ");
      choice = scanner.nextInt();
    } while (choice == 1);
  }

  public static void isDivideIntoThreeWithoutResidue(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 3 == 0) {
        System.out.println("Array % 3 = 0 - " + array[i]);
      }
    }
  }

  public static void toPrintEvenElements(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0) {
        System.out.println("Even elements: " + array[i]);
      }
    }
  }

  public static int sumOfArray(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

  public static double averageOfArray(int[] array) {
    double average = sumOfArray(array) / array.length;
    return average;
  }

  public static int sumMinimumAndMaximum(int[] array) {
    int minimum = array[0];
    int maximum = array[0];

    for (int i = 0; i < array.length; i++) {
      if (minimum > array[i]) {
        minimum = array[i];
      }
      if (maximum < array[i]) {
        maximum = array[i];
      }
    }
    return minimum + maximum;
  }

  public static int compositionOfOddEllements(int[] array) {

    int composition = 1;
    for (int i = 0; i < array.length; i++) {
      if (i % 2 != 0) {
        composition *= array[i];
      }
    }
    return composition;
  }

  public static void foundElements(int[] array, int number) {
    int checkElement = 0;
    int j = 0;
    int[] position = new int[100];
    for (int i = 0; i < array.length; i++) {
      if (number == array[i]) {
        checkElement++;
        position[j] = i;
        j++;
      }
    }

    if (checkElement != 0) {
      while (checkElement != 0) {
        int i = 0;
        System.out.println("Ellement was found! His position: " + position[i++]);
        checkElement--;
      }
    } else {
      System.out.println("Elemunt not found");
    }
  }

  public static void task1() {
    Scanner scanner = new Scanner(System.in);
    int length = 10;
    System.out.println("Array length - " + length + ".");
    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Enter " + i + " element: ");
      array[i] = scanner.nextInt();
    }

    System.out.println("\nPrint first 5 elements:");
    for (int i = 0; i < 5; i++) {
      System.out.print(array[i] + " \n");
    }
  }

  public static void printArray(int[] array) {
    System.out.print("Current array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void task2() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter array length: ");
    int length1 = scanner.nextInt();
    int[] array = new int[length1];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    printArray(array);
  }

  public static void task3() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter array length: ");
    int length = scanner.nextInt();
    int[] array = new int[length];
    for (int i = 0; i < array.length; i++) {
      array[i] = array.length - i;
    }
    printArray(array);
  }

  public static void fillArrayRandom(int[] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10);
    }
  }

}
