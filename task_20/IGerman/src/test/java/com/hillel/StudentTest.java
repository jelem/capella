package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentTest {

  @Test
  public void shouldSortByFirstName() {

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

    String result = students.get(0).getFirstName();
    assertThat(result, is("Bob"));
    String result1 = students.get(1).getFirstName();
    assertThat(result1, is("Bony"));
  }

  @Test
  public void shouldSortByAge() {

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

    Collections.sort(students, (o1, o2) -> (o2.getAge() - o1.getAge()));

    String result = students.get(0).getFirstName();
    assertThat(result, is("Bony"));
    String result1 = students.get(3).getFirstName();
    assertThat(result1, is("Pol"));
  }

  @Test
  public void shouldSortByCity() {

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

    Collections.sort(students, Comparator.comparing(Student::getCity));

    String result = students.get(0).getFirstName();
    assertThat(result, is("Mark"));
    String result1 = students.get(3).getFirstName();
    assertThat(result1, is("Bony"));
  }


}
