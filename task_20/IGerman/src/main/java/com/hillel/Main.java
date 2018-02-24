package com.hillel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    City city1 = new City("Odessa", "Ukraine");
    City city2 = new City("Kiev", "Ukraine");
    City city3 = new City("Lvov", "Ukraine");

    Student student1 = new Student("Bob", "Willy", 25, city1);
    Student student2 = new Student("Mark", "Twain", 28, city2);
    Student student3 = new Student("Bony", "EM", 30, city1);
    Student student4 = new Student("Pol", "MKartney", 23, city3);

    ArrayList<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);

    Collections.sort(students);
    System.out.println(students);

    Comparator decreaseAgeComparator = new DecreaseAgeComparator();
    Collections.sort(students, decreaseAgeComparator);
    System.out.println(students);

    Collections.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
    System.out.println(students);

    Collections.sort(students, Comparator.comparing(Student::getCity));
    System.out.println(students);
  }

  private static class DecreaseAgeComparator implements Comparator<Student>, Serializable {

    @Override
    public int compare(Student o1, Student o2) {
      return o2.getAge() - o1.getAge();
    }
  }


}

