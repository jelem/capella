package ua.pp.darknsoft;

import java.util.NoSuchElementException;

public class CustomArrayList<GeneralizeType> implements CustomList<GeneralizeType> {

  private GeneralizeType[] array;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  public CustomArrayList() {
    array = (GeneralizeType[]) new Object[DEFAULT_CAPACITY];
  }

  public CustomArrayList(int cap) {
    array = (GeneralizeType[]) new Object[cap];
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
  public boolean contains(GeneralizeType element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(GeneralizeType element) {
    if (size >= array.length) {
      resize();
    }
    array[size++] = element;
  }

  private void resize() {
    GeneralizeType[] newArray = (GeneralizeType[]) new Object[array.length * 2];
    System.arraycopy(array, 0, newArray, 0, array.length);
    array = newArray;
    System.out.println("array.length: " + array.length);
  }

  @Override
  public void add(int index, GeneralizeType element) {

    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    if (size >= array.length) {
      resize();
    }
    GeneralizeType[] newArray = (GeneralizeType[]) new Object[array.length + 1];
    System.arraycopy(array, 0, newArray, 0, index + 1);
    newArray[index] = element;
    System.arraycopy(array, index, newArray, index + 1, array.length - index);
    array = newArray;
    size++;
  }

  @Override
  public boolean remove(GeneralizeType element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
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
  public GeneralizeType remove(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    GeneralizeType tmp = array[index];
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
  public GeneralizeType get(int index) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    return array[index];
  }

  @Override
  public void set(int index, GeneralizeType element) {
    if (index >= size || index < 0) {
      throw new NoSuchElementException("Wrong index");
    }
    array[index] = element;
  }

  @Override
  public int indexOf(GeneralizeType element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }
}
