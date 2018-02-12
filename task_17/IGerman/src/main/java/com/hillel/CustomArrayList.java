package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList implements CustomList {

  private static final int BASE_SIZE = 10;
  private int size;
  private String[] array;

  CustomArrayList() {
    this(BASE_SIZE);
  }

  CustomArrayList(int capacity) {
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
    if (size == BASE_SIZE) {
      resizeArray();
    }
    array[size] = element;
    size++;
  }

  @Override
  public void add(int index, String element) {
    if (size == BASE_SIZE) {
      resizeArray();
    }
    for (int i = size - 1; i > index; i--) {
      array[i + 1] = array[i];
    }
    array[index] = element;
    size++;
  }

  @Override
  public boolean remove(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        for (int j = i; j < size; j++) {
          array[j] = array[j + 1];
        }
        size--;
        if (size <= array.length / 4) {
          String[] array1 = new String[array.length / 2];
          System.arraycopy(array, 0, array1, 0, size);
          array = array1;
        }
        return true;
      }
      return false;
    }

    return false;
  }

  @Override
  public String remove(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Нет такого элемента");
    }
    String removable = null;
    for (int i = 0; i < size; i++) {
      if (i == index) {
        removable = array[i];
        for (int j = index; j < size; j++) {
          array[j] = array[j + 1];
        }
        size--;
      }
    }
    if (size <= array.length / 4) {
      String[] array1 = new String[array.length / 2];
      System.arraycopy(array, 0, array1, 0, size);
      array = array1;
    }
    return removable;
  }

  @Override
  public void clear() {
    size = 0;
  }

  @Override
  public String get(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Нет такого элемента");
    }
    for (int i = 0; i < size; i++) {
      if (i == index) {
        return array[i];
      }
    }
    return null;
  }

  @Override
  public void set(int index, String element) {
    for (int i = 0; i < size; i++) {
      if (i == index) {
        array[i] = element;
      }
    }
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    throw new NoSuchElementException("Нет такого элемента");
  }

  private void resizeArray() {
    String[] array1 = new String[BASE_SIZE * 2];

    System.arraycopy(array, 0, array1, 0, size);

    array = array1;
  }

  public Iterator iterator() {
    return new CustomListIterator();
  }


  private class CustomListIterator implements Iterator {

    private int current;

    CustomListIterator() {
      current = 0;
    }


    @Override
    public boolean hasNext() {

      return current < size;
    }

    @Override
    public Object next() {

      if (current >= size) {
        throw new NoSuchElementException();
      }
      return array[current++];
    }
  }

  public Iterator backwardIterator() {
    return new BackwardListIterator();
  }

  private class BackwardListIterator implements Iterator {

    private int current;

    BackwardListIterator() {
      current = size - 1;
    }

    @Override
    public boolean hasNext() {

      return current >= 0;
    }

    @Override
    public Object next() {

      if (current < 0) {
        throw new NoSuchElementException();
      }
      return array[current--];
    }
  }

  public Iterator randomIterator() {
    return new RandomIterator();
  }

  private class RandomIterator implements Iterator {

    int current;
    char[] checkArray;
    int count;

    RandomIterator() {
      current = (int) (Math.random() * size);
      checkArray = new char[size];
      count = 0;

    }

    @Override
    public boolean hasNext() {
      return count < size;
    }

    @Override
    public Object next() {
      while (checkArray[current] != 0) {

        current = (int) (Math.random() * size);
        if (current > size && current < 0) {
          throw new NoSuchElementException();
        }
      }
      count++;
      checkArray[current] = 'X';
      return array[current];
    }
  }

}