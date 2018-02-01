package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

  @Test
  public void shouldCompare() {
    List<Student> students = new ArrayList<>();

    City odessa = new City("Odessa", 236.9);
    City kiev = new City("Kiev", 847.66);

    students.add(new Student("Sergey", 20, odessa));
    students.add(new Student("Ivan", 21, odessa));
    students.add(new Student("Alexandr", 20, kiev));
    students.add(new Student("Igor", 22, odessa));
    students.add(new Student("Vasya", 19, kiev));

    Collections.sort(students);
    String stringResult = students.get(0).getName();
    assertThat(stringResult, is("Alexandr"));
    stringResult = students.get(4).getName();
    assertThat(stringResult, is("Vasya"));

    Comparator<Student> studentComparator = new StudentComparator();
    students.sort(studentComparator);
    int intResult = students.get(1).getAge();
    assertThat(intResult, is(20));

    students.sort(new Comparator<Student>() {
      @Override
      public int compare(Student student1, Student student2) {
        String student1City = student1.getCity().getName();
        String student2City = student2.getCity().getName();
        return student1City.compareTo(student2City);
      }
    });
    stringResult = students.get(2).getCity().getName();
    assertThat(stringResult, is("Odessa"));

    students.sort(Comparator.comparingDouble(student -> student.getCity().getSquare()));
    double doubleResult = students.get(3).getCity().getSquare();
    assertThat(doubleResult, is(847.66));
  }
}
