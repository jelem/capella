package com.hillel;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String firstName;
  private String lastName;
  private int age;
  private City city;

  public Student(String firstName, String lastName, int age, City city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.city = city;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }

    Student that = (Student) obj;
    return age == that.age
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(lastName, that.lastName)
        && Objects.equals(city, that.city);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  @Override
  public int compareTo(Student obj) {
    return this.firstName.compareToIgnoreCase(obj.firstName);
  }

  @Override
  public String toString() {
    return "\n" + "Student{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + ", city=" + city
        + '}';
  }
}
