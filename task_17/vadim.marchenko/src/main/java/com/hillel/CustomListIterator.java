package com.hillel;

import java.util.Iterator;

public class CustomListIterator implements Iterator<String> {

  private String[] list;
  private int currentIndex = -1;

  public CustomListIterator(String[] list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    if (currentIndex < list.length - 1) {
      if (list[currentIndex + 1] != null) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String next() {
    currentIndex++;
    return list[currentIndex];

  }
}