package com.dima;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class MyList implements CustomeList {
  public static final int STANDART = 9;
  private int size;
  private int current;
  private String[] array;
  private ListIterator ahead;
  private BackwardIterator back;

  public MyList(int capasity) {
    this.size = capasity;
    current = 0;
    array = new String[size];
    ahead = new ListIterator();
    back = new BackwardIterator();
  }

  public MyList() {
    this(STANDART);
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return current == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < current; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    if (current > size) {
      throw new NoSuchElementException("Incorrect intext to add..");
    } else if (current == size) {
      size *= 2;
      String[] buffer = new String[size];
      copyToFrom(buffer, array);
      array = buffer;
    }
    array[current++] = element;
  }

  @Override
  public void add(int index, String element) {
    if (index < 0) {
      throw new NoSuchElementException("Incorrect index to add..");
    } else if (current >= size) {
      add(element);
      return;
    }

    for (int i = current; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = element;
    current++;
  }

  @Override
  public boolean removeToElement(String element) {
    int index = 0;
    if ((index = indexOf(element)) == -1) {
      return false;
    }
    removeToIndex(index);
    return true;
  }

  @Override
  public String removeToIndex(int index) {
    if (index < 0 || index >= current) {
      throw  new NoSuchElementException("Elemen not found");
    }
    String buffer = array[index];
    current--;
    for (int i = index; i < current; i++ ) {
      array[i] = array[i + 1];
    }
    return buffer;
  }

  @Override
  public void clear() {
    current = 0;
  }

  @Override
  public String get(int index) {
    if (index < 0 || index >= current) {
      throw  new NoSuchElementException("Elemen not found");
    }
    return array[index];
  }

  @Override
  public void set(int index, String element) {
    if (index < 0 || index > current) {
      throw  new NoSuchElementException("Elemen not found");
    }
    array[index] = element;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < current; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public Iterator ahead() {
    return ahead;
  }

  @Override
  public Iterator backward() {
    back.setIterration(current);
    return back;
  }

  private void copyToFrom(String[] buffer, String[] array) {
    for (int i = 0; i < array.length; i++) {
      buffer[i] = array[i];
    }
  }

  private class ListIterator implements Iterator {

    private int iterration;

    public ListIterator(int iterration) {
      this.iterration = iterration;
    }

    public ListIterator() {
      this(0);
    }

    @Override
    public boolean hasNext() {
      return iterration  < current;
    }

    @Override
    public Object next() {
      if (iterration == current) {
        throw new NoSuchElementException("...No such element exception..");
      }
      return array[iterration++];
    }
  }

  private class BackwardIterator implements Iterator {

    private int iterration;

    public BackwardIterator(int iterration) {
      this.iterration = iterration;
    }

    public BackwardIterator() {
      this(current);
    }

    public void setIterration(int iterration) {
      this.iterration = iterration;
    }

    @Override
    public boolean hasNext() {
      return iterration > 0;
    }

    @Override
    public Object next() {
      if (iterration == 0) {
        throw new NoSuchElementException("..No such element..");
      }
      return array[--iterration];
    }
  }
}
