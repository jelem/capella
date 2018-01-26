package com.hillel;

import java.io.Serializable;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student1.getAge(), student2.getAge());
  }
}
