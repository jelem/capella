package com.dima;

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
  public boolean equals(Object o) {
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    Student tmp = (Student) o;
    if (!this.city.equals(tmp.city) || this.city == null || tmp.city == null
        || !this.name.equals(tmp.name) || this.name == null || tmp.name == null
        || this.age != tmp.age) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", city=" + city +
        '}' + '\n';
  }

  @Override
  public int compareTo(Student student) {
    if (this.name.compareTo(student.name) < 0) {
      return -1;
    }

    if (this.name.compareTo(student.name) > 0) {
      return 1;
    }
    return 0;
  }
}