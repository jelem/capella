package com.hillel;

import java.util.NoSuchElementException;

public class CustomArray implements CustomArrayList {

  private static final int DEFAULT_CAPACITY = 10;
  private String[] array;
  private int size;

  public CustomArray() {
    this(DEFAULT_CAPACITY);
  }

  public CustomArray(int capacity) {
    array = new String[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  private void resizeArray() {
    String[] newArray = new String[size * 2];
    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    array = newArray;

  }

  @Override
  public void add(String element) {
    if (size > array.length) {
      resizeArray();
    }
    array[size] = element;
    size++;
  }

  @Override
  public void add(int index, String element) {
    checkIndex(index);
    for (int i = index; i < array.length - 1; i++) {
      array[i + 1] = array[i];
    }
    array[index] = element;
    size++;
  }

  private void checkIndex(int index) {
    if (index < 0 || index > size) {
      throw new NoSuchElementException("Incorrect index");
    }
  }

  @Override
  public boolean remove(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        for (int j = i; j < size; j++) {
          array[i] = array[i + 1];
        }
        array[--size] = null;
        return true;
      }
    }
    return false;
  }

  @Override
  public String remove(int index) {
    checkIndex(index);
    final String result = array[index];
    for (int i = index; i < size; i++) {
      array[i] = array[i + 1];
    }
    array[size] = null;
    size--;
    return result;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      array[i] = null;
    }
    size = 0;
  }

  @Override
  public String get(int index) {
    checkIndex(index);
    return array[index];
  }

  @Override
  public void set(int index, String element) {
    checkIndex(index);
    array[index] = element;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException("No such element :(");
  }
}
