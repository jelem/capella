package com.dima;

import java.util.Comparator;

public class District implements Comparator<Student> {
  @Override
  public int compare(Student tmp, Student tmp1) {
    if (tmp.getCity().getDistrict().compareTo(tmp1.getCity().getDistrict()) < 0) {
      return -1;
    }

    if (tmp.getCity().getDistrict().compareTo(tmp1.getCity().getDistrict()) > 0) {
      return 1;
    }
    return 0;
  }
}
