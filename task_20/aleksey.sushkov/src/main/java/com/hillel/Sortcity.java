package com.hillel;

import java.io.Serializable;
import java.util.Comparator;

public class Sortcity implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getCity().getCityname().compareTo(o2.getCity().getCityname());
  }
}
