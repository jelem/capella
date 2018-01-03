package com.lev;

public class CustomArrayList implements CustomList{

  private static final int BASE_SIZE = 10;
  private String[] array;
  private int size;

  public CustomArrayList() {
    this(BASE_SIZE);
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
    array[size + 1] = element;
    size++;
  }

  @Override
  public void add(int index, String element) {
    for (int i = index; i < array.length; i++) {
      array[i + 1] = array[i];
    }
    array[index] = element;
    size++;
  }

  @Override
  public boolean remove(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        for (int j = i; j < size; j++) {
          array[j] = array[j + 1];
        }
        return true;
      }
    }
    return false;
  }

  @Override
  public String remove(int index) {
    String element = array[index];
    for (int i = index; i < array.length; i++) {
      array[i] = array[i + 1];
    }
    return "removed " + element;
  }

  @Override
  public void clear() {
    size = 0;
  }

  @Override
  public String get(int index) {
    return array[index];
  }

  @Override
  public void set(int index, String element) {
    array[index] = element;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    return 0;
  }
}
