package com.hillel;

import java.io.Serializable;
import java.util.Comparator;

public class Sortagereverse implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare(o2.getAge(), o1.getAge());
  }
}

