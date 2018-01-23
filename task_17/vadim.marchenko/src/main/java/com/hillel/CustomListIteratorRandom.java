package com.hillel;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CustomListIteratorRandom implements Iterator<String> {

  private String[] randomList;
  private CustomListIterator customListIterator;

  public CustomListIteratorRandom(String[] list) {
    randomList = new String[getRealLength(list)];
    for (int i = 0; i < getRealLength(list); i++) {
      randomList[i] = list[i];
    }
    Collections.shuffle(Arrays.asList(this.randomList));
    customListIterator = new CustomListIterator(this.randomList);
  }

  private int getRealLength(String[] list) {
    int counter = 0;
    for (String element : list) {
      if (element != null) {
        counter++;
      }
    }
    return counter;
  }

  @Override
  public boolean hasNext() {
    return customListIterator.hasNext();
  }

  @Override
  public String next() {
    return customListIterator.next();
  }
}