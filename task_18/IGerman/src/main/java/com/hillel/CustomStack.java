package com.hillel;

import java.util.NoSuchElementException;

public class CustomStack {


  private static final int BASE_SIZE = 10;
  private int[] customArray;
  private int[] minArray;
  private int minimum;
  private int current;


  private CustomStack(int capacity) {
    customArray = new int[capacity];
    minArray = new int[capacity];
    current = 0;
  }

  public CustomStack() {
    this(BASE_SIZE);
  }

  public int size() {
    return current;
  }

  public void push(int element) {
    if (current < BASE_SIZE) {
      customArray[current] = element;
      if (minimum > element) {
        minimum = element;
      }
      current++;
    } else {
      throw new StackOverflowError();
    }
  }

  public int pop() {
    int customInt = customArray[current];
    current--;
    minimum = minArray[current];
    return customInt;
  }

  public int peek() {
    return customArray[current];
  }

  public boolean isEmpty() {
    return current == 0;
  }

  public int min() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }

    return minimum;
  }

  public int max() {
    int max = customArray[0];
    for (int element : customArray) {
      if (element > max) {
        max = element;
      }
    }
    return max;
  }

}
