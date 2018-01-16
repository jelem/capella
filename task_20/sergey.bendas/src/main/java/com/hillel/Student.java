package com.hillel;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String name;
  private int age;
  private City city;

  public Student(String name, int age, City city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public com.hillel.City getCity() {
    return city;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    }
    if (object == null) {
      return false;
    }
    if (object.getClass() != this.getClass()) {
      return false;
    }
    Student student = (Student) object;
    return Objects.equals(name, student.name)
        && age == student.age
        && city == student.city;
  }


  @Override
  public int hashCode() {
    return Objects.hash(name, age, city);
  }

  @Override
  public int compareTo(Student student) {
    return name.compareTo(student.name);
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name
        + '\'' + ", age=" + age
        + ", City=" + city + '}';
  }
}
