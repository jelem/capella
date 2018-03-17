package com.lev;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList implements CustomList {

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

  private void resizeArray() {
    String[] arr = new String[array.length * 2];
    System.arraycopy(array, 0, arr, 0, size);
    array = arr;
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
    for (int i = index; i < size; i++) {
      array[i + 1] = array[i];
    }
    array[index] = element;
    size++;
  }

  @Override

  public boolean remove(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        System.arraycopy(array, i + 1, array, i, size - i);
        size--;
        return true;
      }
    }
    return false;
  }

  @Override

  public String remove(int index) {
    String element = array[index];
    System.arraycopy(array, index + 1, array, index, size - index);
    size--;
    return "Removed " + element;
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

  @Override

  public Iterator iterator() {
    return new ListIterator();
  }

  public Iterator backwardIterator() {
    return new BackwardListIterator();
  }

  private class ListIterator implements Iterator {

    private int current;

    ListIterator() {
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

  private class BackwardListIterator implements Iterator {

    private int current = size - 1;

    @Override

    public boolean hasNext() {
      return current >= 0;
    }

    @Override

    public Object next() {
      if (current - 1 == -1) {
        throw new NoSuchElementException("нет элементов");
      }
      return array[current--];
    }
  }
}
