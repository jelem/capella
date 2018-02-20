package com.hillel;

import java.util.EmptyStackException;

public class CustomStack {

  public static final int BASE_CAPACITY = 10;
  private int[] arr;
  private int[] minarr;
  private int[] maxarr;
  private int min;
  private int max;
  private int curr;

  public CustomStack(int capacity) {
    arr = new int[capacity];
    minarr = new int[capacity];
    maxarr = new int[capacity];
    curr = 0;
  }

  public CustomStack() {
    this(BASE_CAPACITY);
  }

  public int size() {
    return arr.length;
  }

  public boolean isEmpty() {
    return (curr == 0);
  }

  public void push(int elem) {
    if (curr >= arr.length) {
      throw new StackOverflowError();
    }
    if (isEmpty()) {
      max = elem;
      min = elem;
    }
    if (min > elem) {
      min = elem;
      minarr[curr] = min;
    }
    if (max < elem) {
      max = elem;
      maxarr[curr] = max;
    }
    arr[curr++] = elem;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    int popelem = arr[curr];
    min = minarr[curr - 1];
    max = maxarr[curr - 1];
    return popelem;
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return arr[curr - 1];
  }

  public int min() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return min;
  }

  public int max() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return max;
  }

}
