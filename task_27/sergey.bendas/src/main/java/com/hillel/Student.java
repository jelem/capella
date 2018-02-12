package com.hillel;

import java.util.Objects;

public class Student {

  private String firstName;
  private String lastName;
  private Integer age;

  private Student(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private Integer age;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public Student build() {
      if (lastName == null && firstName == null) {
        return null;
      }
      return new Student(this);
    }
  }


  public String getFirstName() {

    return firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Student: \n");
    if (lastName != null) {
      stringBuilder.append("  LastName = ").append(lastName).append("\n");
    }
    if (firstName != null) {
      stringBuilder.append("  FirstName = ").append(firstName).append("\n");
    }
    if (age != null) {
      stringBuilder.append("  Age = ").append(age).append("\n");
    }
    return stringBuilder.toString();
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
    return Objects.equals(firstName, student.firstName)
        && Objects.equals(lastName, student.lastName)
        && Objects.equals(age, student.age);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName, age);
  }


}
