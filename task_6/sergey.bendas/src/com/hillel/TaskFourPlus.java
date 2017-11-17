package com.hillel;

import java.util.Scanner;

class TaskFourPlus {

  private int[] array;

  private void createArrayWithEnteredLength() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter array's length: ");
    byte len = scanner.nextByte();
    array = new int[len];
    fillArray();
  }

  private void checkArray() {
    if (!arrayIsCreated()) {
      createArrayWithEnteredLength();
    }
  }

  private boolean arrayIsCreated() {
    return array != null;
  }

  private void fillArray() {
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.print("Enter element " + i + ": ");
      array[i] = scanner.nextInt();
    }
  }

  void printDivThreeElements() {
    checkArray();
    for (int element : array) {
      if (isDivThree(element)) {
        System.out.println(element);
      }
    }
  }

  private boolean isDivThree(int element) {
    return element % 3 == 0;
  }

  void printEvenElements() {
    checkArray();
    for (int element : array) {
      if (isEven(element)) {
        System.out.println(element);
      }
    }
  }

  private boolean isEven(int element) {
    return element % 2 == 0;
  }

  long arraySum() {
    checkArray();
    long sum = 0;
    for (int element : array) {
      sum += element;
    }
    return sum;
  }

  long arrayAverage() {
    checkArray();
    return arraySum() / array.length;
  }

  int sumMinMax() {
    checkArray();
    return arrayMin() + arrayMax();
  }

  private int arrayMax() {
    checkArray();
    int max = array[0];
    for (int element : array) {
      max = element > max ? element : max;
    }
    return max;
  }

  private int arrayMin() {
    checkArray();
    int min = array[0];
    for (int element : array) {
      min = element < min ? element : min;
    }
    return min;
  }

  int mulOfUneven() {
    checkArray();
    int mul = 1;
    for (int element : array) {
      if (!isEven(element)) {
        mul *= element;
      }
    }
    return mul;
  }

  int findIndex(int element) {
    checkArray();
    for (int i = 0; i < array.length; i++) {
      if (element == array[i]) {
        return i;
      }
    }
    return -1;
  }

  boolean elementIsIn(int element) {
    checkArray();
    for (int elem : array) {
      if (elem == element) {
        return true;
      }
    }
    return false;
  }
}
