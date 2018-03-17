package com.lev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    City odessa = new City("Ukraine", "Odessa");
    City kiev = new City("Ukraine", "Kiev");
    City california = new City("USA", "California");
    Student rose = new Student("Rose",20,california);
    Student dany = new Student("Dany",30,odessa);
    Student john = new Student("John",25,kiev);
    Student rose1 = new Student("Rose",15,california);

    List<Student> students = new ArrayList<>();

    students.add(rose);
    students.add(dany);
    students.add(john);
    students.add(rose1);

    //nature order
    Collections.sort(students);

    for (Object o : students) {
      System.out.println(o);
    }

    System.out.println();

    //decrease order
    students.sort((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));

    for (Object o : students) {
      System.out.println(o);
    }

    System.out.println();

    //name order
    students.sort(Comparator.comparing(Student::toString));

    for (Object o : students) {
      System.out.println(o);
    }

    System.out.println();

    //city order
    students.sort(new CityOrder());

    for (Object o : students) {
      System.out.println(o);
    }

    System.out.println();
  }
}
