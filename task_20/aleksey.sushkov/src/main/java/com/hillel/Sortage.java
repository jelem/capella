package com.hillel;

import java.io.Serializable;
import java.util.Comparator;

public class Sortage implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare(o1.getAge(), o2.getAge());
  }
}

