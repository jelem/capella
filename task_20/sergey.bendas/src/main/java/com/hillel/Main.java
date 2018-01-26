package com.hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    City odessa = new City("Odessa", 236.9);
    City kiev = new City("Kiev", 847.66);

    students.add(new Student("Sergey", 20, odessa));
    students.add(new Student("Ivan", 21, odessa));
    students.add(new Student("Alexandr", 20, kiev));
    students.add(new Student("Igor", 22, odessa));
    students.add(new Student("Vasya", 19, kiev));

    Collections.sort(students);
    print(students);

    Comparator<Student> studentComparator = new StudentComparator();
    students.sort(studentComparator);
    print(students);

    students.sort(new Comparator<Student>() {
      @Override
      public int compare(Student student1, Student student2) {
        String student1City = student1.getCity().getName();
        String student2City = student2.getCity().getName();
        return student1City.compareTo(student2City);
      }
    });
    print(students);

    students.sort(Comparator.comparingDouble(student -> student.getCity().getSquare()));
  }

  private static void print(List<Student> students) {
    System.out.println();
    for (Student student : students) {
      System.out.println(student);
    }
    System.out.println();
  }
}
