package com.hillel;

import java.util.Iterator;

public class CustomList implements ICustomList,Iterable<String> {

  private String[] list = new String[10];

  @Override
  public int size() {
    int counter = 0;
    for (String element : list) {
      if (element != null) {
        counter++;
      }
    }
    return counter;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(String element) {
    for (String value : list) {
      if (value != null) {
        if (value.equals(element)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    int lastIndex = list.length;
    for (int i = 0; i < list.length; i++) {
      if (list[i] == null) {
        list[i] = element;
        return;
      }
    }
    extend();
    list[lastIndex] = element;
  }

  @Override
  public void add(int index, String element) {
    while (index < list.length) {
      extend();
    }
    list[index] = element;
  }

  private void extend() {
    String[] newList = new String[list.length * 2];
    for (int i = 0; i < list.length; i++) {
      newList[i] = list[i];
    }
    list = newList;
  }

  @Override
  public boolean remove(String element) {
    int index = indexOf(element);
    if (index != -1) {
      list[index] = null;
      return true;
    }
    return false;
  }

  @Override
  public String remove(int index) {
    if (index > list.length) {
      return null;
    }

    String element = list[index];
    list[index] = null;
    return element;
  }

  @Override
  public void clear() {
    list = new String[list.length];
  }

  @Override
  public String get(int index) {
    if (index >= list.length) {
      return null;
    }
    return list[index];
  }

  @Override
  public void set(int index, String element) {
    add(index, element);
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < list.length; i++) {
      if (list[i] != null) {
        if (list[i].equals(element)) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public Iterator<String> iterator() {
    return new CustomListIteratorRandom(list);
  }
}
