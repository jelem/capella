package com.hillel;

import java.util.EmptyStackException;

public class CustomStack {

  public static final int DEFAULT_CAPACITY = 10;
  private int[] array;
  private int[] arrayMinimum;
  private int[] arrayMaximum;
  private int cursor;
  private int minimum;
  private int maximum;

  public CustomStack() {
    this(DEFAULT_CAPACITY);
  }

  public CustomStack(int capacity) {
    array = new int[capacity];
    arrayMinimum = new int[capacity];
    arrayMaximum = new int[capacity];
  }

  public void push(int element) {
    if (cursor > array.length) {
      throw new StackOverflowError();
    }
    if (isEmpty()) {
      minimum = element;
      maximum = element;
    }
    if (arrayMinimum[cursor] != 0 && arrayMaximum[cursor] != 0) {
      arrayMaximum[cursor] = element;
      arrayMinimum[cursor] = element;
    }
    minimum = minimum < element ? minimum : element;
    maximum = maximum > element ? maximum : element;
    arrayMinimum[cursor] = minimum;
    arrayMaximum[cursor] = maximum;
    array[cursor++] = element;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return array[--cursor - 1];
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return array[cursor - 1];
  }

  private boolean isEmpty() {
    return cursor == 0;
  }

  public int min() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return arrayMinimum[cursor - 1];
  }

  public int max() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return arrayMaximum[cursor - 1];
  }


}
