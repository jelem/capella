package com.lev;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String name;
  private int age;
  private City city;

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }

    Student student = (Student) obj;

    return this.name.equals(student.name) && this.age == ((Student) obj).age;
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age, city);
  }

  public Student(String name, int age, City city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }



  @Override
  public int compareTo(Student student) {
    return this.age - student.age;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='" + name + '\''
        + ", age=" + age
        + ", city=" + city + '}';
  }

  public int getAge() {
    return age;
  }

  public City getCity() {
    return city;
  }
}
