package ua.pp.darknsoft;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList<T> implements CustomList<T> {

  private T[] array;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public CustomArrayList() {
    array = (T[]) new Object[DEFAULT_CAPACITY];
  }

  public CustomArrayList(int cap) {
    array = (T[]) new Object[cap];
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
  public boolean contains(T element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(T element) {
    if (size >= array.length) {
      resize();
    }
    array[size++] = element;
  }

  @Override
  public void add(int index, T element) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    if (size >= array.length) {
      resize();
    }
    T[] newArray = (T[]) new Object[array.length + 1];
    System.arraycopy(array, 0, newArray, 0, index + 1);
    newArray[index] = element;
    System.arraycopy(array, index, newArray, index + 1, array.length - index);
    array = newArray;
    size++;
  }

  @Override
  public boolean remove(T element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        for (int j = i; j < size; j++) {
          array[j] = array[j + 1];
        }
        size--;
        return true;
      }
    }
    return false;
  }

  @Override
  public T remove(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    T tmp = array[index];
    for (int j = index; j < size; j++) {
      array[j] = array[j + 1];
    }
    size--;
    return tmp;
  }

  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      array[i] = null;
    }
    size = 0;
  }

  @Override
  public T get(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    return array[index];
  }

  @Override
  public void set(int index, T element) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    array[index] = element;
  }

  @Override
  public int indexOf(T element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  private void resize() {
    T[] newArray = (T[]) new Object[array.length * 2];
    System.arraycopy(array, 0, newArray, 0, array.length);
    array = newArray;
    System.out.println("array.length: " + array.length);
  }

  public Iterator iterator() {
    return new ListIterator();
  }

  @Override
  public Iterator backwardIterator() {
    return new BackwardIterator();
  }

  private class ListIterator implements Iterator {

    private int current = 0;

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public T next() {
      if (current >= size) {
        throw new NoSuchElementException();
      }
      T currentElement = array[current++];
      return currentElement;
    }
  }

  private class BackwardIterator implements Iterator {

    private int current = size - 1;

    @Override
    public boolean hasNext() {
      return current >= 0;
    }

    @Override
    public T next() {
      if (current >= size) {
        throw new NoSuchElementException();
      }
      return array[current--];
    }
  }
}
