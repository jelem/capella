package com.dima;

public class Student {
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
}
