package com.hillel;

public class CustomStack {

  private int stackSize = 10;

  private int[] stackArray = new int[stackSize];
  private int currentIndex = -1;

  public int push(int number) {
    currentIndex++;
    stackArray[currentIndex] = number;
    return number;
  }

  public int pop() {
    int popInt = stackArray[currentIndex];
    currentIndex--;
    return popInt;
  }

  public int peek() {
    return stackArray[currentIndex];
  }

  public int min() {
    int minimalNumber = stackArray[0];
    for (int element : stackArray) {
      if (element < minimalNumber) {
        minimalNumber = element;
      }
    }
    return minimalNumber;
  }

  public int max() {
    int maximalNumber = stackArray[0];
    for (int element : stackArray) {
      if (element > maximalNumber) {
        maximalNumber = element;
      }
    }
    return maximalNumber;
  }
}
