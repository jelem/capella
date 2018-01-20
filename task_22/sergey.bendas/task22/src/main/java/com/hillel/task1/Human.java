package com.hillel.task1;

import java.util.Objects;

public class Human {

  private String firstName;
  private String lastName;
  private int age;

  public Human(String firstName, String lastName, int age) {
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
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Human human = (Human) object;
    return age == human.age &&
        Objects.equals(firstName, human.firstName) &&
        Objects.equals(lastName, human.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age);
  }

  @Override
  public String toString() {
    return "Human{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + '}';
  }
}
