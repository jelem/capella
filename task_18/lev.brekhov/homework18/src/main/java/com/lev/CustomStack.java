package com.lev;

import java.util.NoSuchElementException;

public class CustomStack {

  private static final int DEFAULT_CAPACITY = 10;
  private int[] arr;
  private int current = -1;
  private int[] minArr;

  public CustomStack() {
    this(DEFAULT_CAPACITY);
  }

  public CustomStack(int capacity) {
    arr = new int[capacity];
    minArr = new int[capacity];
  }

  public void push(int elem) {
    if (current > arr.length) {
      throw new StackOverflowError();
    }
    current++;
    arr[current] = elem;
    if (elem < minArr[current] || current - 1 == -1) {
      minArr[current] = elem;
    } else {
      minArr[current] = minArr[current - 1];
    }
  }

  public int pop() {
    return arr[--current];
  }

  public int peek() {
    return arr[current];
  }

  public int min() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return minArr[current];
  }

  public boolean isEmpty() {
    return current == -1;
  }

  public int size() {
    return arr.length;
  }
}
