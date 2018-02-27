package com.dima;

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

  public City getCity() {
    return city;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }

    Student tmp = (Student) obj;
    if (this.city == null || tmp.city == null
        || this.name == null || tmp.name == null
        || !this.city.equals(tmp.city) || !this.name.equals(tmp.name)
        || this.age != tmp.age) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", city="
        + city
        + '}'
        + '\n';
  }

  @Override
  public int hashCode() {
    return super.hashCode();
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