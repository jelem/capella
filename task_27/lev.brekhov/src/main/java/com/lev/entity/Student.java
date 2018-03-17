package com.lev.entity;

public class Student {

  private String firstname;
  private String lastname;
  private int age;

  public Student() {
  }

  public Student(String firstname, String lastname, int age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" + "firstname='" + firstname + '\''
        + ", lastname='" + lastname + '\''
        + ", age=" + age + '}';
  }
}
