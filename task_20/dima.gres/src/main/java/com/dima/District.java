package com.dima;

import java.util.Comparator;

public class District implements Comparator<Student> {
  @Override
  public int compare(Student t, Student t1) {
    if (t.getCity().getDistrict().compareTo(t1.getCity().getDistrict()) < 0) {
      return -1;
    }

    if (t.getCity().getDistrict().compareTo(t1.getCity().getDistrict()) > 0) {
      return 1;
    }
    return 0;
  }
}
