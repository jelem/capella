package com.hillel;

import java.util.NoSuchElementException;

public class CustomArrayList implements CustomList {

  private static final int BASE_SIZE = 10;
  private String[] array;
  private int size;
  private int index;

  public CustomArrayList() {
    array = new String[BASE_SIZE];
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return (size == 0);
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    } return false;
  }

  @Override
  public void add(String element) {
    if (size > array.length) {
      resizeArray();
    }
    array[size] = element;
    size++;
  }

  private void resizeArray() {
    String[] array1 = new String[array.length * 2];
    for (int i = 0; i < array.length; i++) {
      array1[i] = array[i];
    }
    array = array1;
  }

  @Override
  public void add(int index, String element) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    if (size > array.length) {
      resizeArray();
    }
    for (int i = index; i < size; i++) {
      array[i+1] = array[i];
    }
    array[index] = element;
    size++;
  }

  @Override
  public boolean remove(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        for (int j = i; j < array.length; j++) {
          array[j] = array[j + 1];
        }
        array[size] = null;
        size--;
        return true;
      }
    }
    return false;
  }

  @Override
  public String remove(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    String elem = array[index];
    for (int i = index; i < size; i++) {
      array[i] = array[i+1];
    }
    array[size] = null;
    size--;
    return elem;
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
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    return array[index];
  }

  @Override
  public void set(int index, String element) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    array[index] = element;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element) ) {
        return i;
      }
    }
    return -1;
  }
}
