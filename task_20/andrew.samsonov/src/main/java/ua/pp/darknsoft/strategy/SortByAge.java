package ua.pp.darknsoft.strategy;

import ua.pp.darknsoft.Student;

import java.io.Serializable;
import java.util.Comparator;

public class SortByAge implements Comparator<Student>, Serializable {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getAge() - o2.getAge();
  }
}
