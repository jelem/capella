package com.hillel;

import java.util.Objects;
import java.util.Comparator;

public class Student implements Comparable<Student>{

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

  public City getCity() {
    return city;
  }

  @Override
  public String toString() {
    return name + ", age = " + age + ", city: " + city;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Student student = (Student) obj;

    boolean names = Objects.equals(this.name, student.name);
    boolean ages = this.age == student.age;
    boolean cities = this.city == student.city;

    return names && ages && cities;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, city);
  }

  @Override
  public int compareTo(Student student) {
    return Comparator.comparing(Student :: getName).compare(this, student);
  }

}
