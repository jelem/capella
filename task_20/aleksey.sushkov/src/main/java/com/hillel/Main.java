package com.hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
     City odessa = new City("Odessa", 1029049);
     City kiev = new City("Kiev", 2611327);
     City lvov = new City("Lvov", 732818);

     students.add(new Student("Anton", 20, odessa));
     students.add(new Student("Katya", 23, kiev));
     students.add(new Student("Vlad", 19, odessa));
     students.add(new Student("John", 25, lvov));
     students.add(new Student("Kachiko", 22, kiev));

     Collections.sort(students);
     System.out.println("Original sort:\n");
     for (Student std : students) {
       System.out.println(std);
     }

     System.out.println("\nSort by age:\n");
     Collections.sort(students, new Sortage());
     for (Student std : students) {
       System.out.println(std);
     }

    System.out.println("\nSort by age -:\n");
    Collections.sort(students, new Sortagereverse());
    for (Student std : students) {
      System.out.println(std);
    }

    System.out.println("\nSort by city's name:\n");
    Collections.sort(students, new Sortcity());
    for (Student std : students) {
      System.out.println(std);
    }
  }

}
