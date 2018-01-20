package ua.pp.darknsoft.strategy;

import java.util.Comparator;

import ua.pp.darknsoft.Student;

public class SortByAddress implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getAddress().compareTo(o2.getAddress());
  }
}
