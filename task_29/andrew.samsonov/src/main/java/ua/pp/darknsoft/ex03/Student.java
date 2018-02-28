package ua.pp.darknsoft.ex03;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
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
    return age == student.age
        && Objects.equals(firstName, student.firstName)
        && Objects.equals(lastName, student.lastName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName, age);
  }


  @Override
  public String toString() {
    return "Student{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + '}';
  }

  @Override
  public int compareTo(Student student) {
    return this.firstName.compareTo(student.firstName);
  }
}
