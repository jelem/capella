package com.hillel;

import java.util.NoSuchElementException;


public class CustomArrayList implements CustomList {

  private static final int BASE_LEN = 10;
  private String[] array;
  private int size;
  private int startLen;

  public CustomArrayList() {
    this(BASE_LEN);
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
    startLen = capacity;
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
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    checkArraySize();
    array[size] = element;
    size++;
  }

  @Override
  public void add(int index, String element) {
    checkSuchElementException(index);
    checkArraySize();
    System.arraycopy(array, index, array, index + 1, size - index);
    array[index] = element;
    size++;
  }

  @Override
  public boolean remove(String element) {
    if (!contains(element)) {
      return false;
    }
    int index = indexOf(element);
    size--;
    System.arraycopy(array, index + 1, array, index, size - index);
    checkArraySize();
    return true;
  }

  @Override
  public String remove(int index) {
    String element = get(index);
    size--;
    System.arraycopy(array, index + 1, array, index, size - index);
    return element;
  }

  @Override
  public void clear() {
    array = new String[startLen];
    size = 0;
  }

  @Override
  public String get(int index) {
    checkSuchElementException(index);
    return array[index];
  }

  @Override
  public void set(int index, String element) {
    checkSuchElementException(index);
    array[index] = element;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException();
  }

  private void checkArraySize() {
    if (size >= array.length) {
      enlargeArray();
      return;
    }
    if (size >= 2 * startLen && size < array.length >> 2) {
      reduceArray();
    }
  }

  private void reduceArray() {
    String[] newArray = new String[array.length >> 1];
    System.arraycopy(array, 0, newArray, 0, size);
    array = newArray;
  }

  private void enlargeArray() {
    String[] newArray = new String[array.length * 2];
    System.arraycopy(array, 0, newArray, 0, size);
    array = newArray;
  }


  private void checkSuchElementException(int index) {
    if (index < 0 || index > size) {
      throw new NoSuchElementException();
    }
  }


}
