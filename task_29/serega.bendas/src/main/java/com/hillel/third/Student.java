package com.hillel.third;

import java.util.Objects;

public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Student student = (Student) object;
    return age == student.age
        && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='" + name + '\''
        + ", age=" + age
        + '}';
  }
}
