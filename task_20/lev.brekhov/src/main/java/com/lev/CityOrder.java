package com.lev;

import java.io.Serializable;
import java.util.Comparator;

public class CityOrder implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getCity().getCity().compareTo(o2.getCity().getCity());
  }
}
