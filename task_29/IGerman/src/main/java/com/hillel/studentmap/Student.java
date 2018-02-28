package com.hillel.studentmap;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String lastName;
  private String firstName;

  public Student(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }
    Student student = (Student) obj;
    return Objects.equals(lastName, student.lastName)
        && Objects.equals(firstName, student.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName);
  }

  @Override
  public int compareTo(Student obj) {

    return this.lastName.compareTo(obj.lastName);
  }


  @Override
  public String toString() {
    return "Student{"
        + "lastName='" + lastName + '\''
        + ", firstName='" + firstName + '\''
        + '}';
  }
}
