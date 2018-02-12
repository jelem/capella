package com.hillel.hotel;

import java.util.Objects;

public class Visitor {

  private String firstName;
  private String lastName;
  private int age;

  Visitor(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Visitor)) {
      return false;
    }
    Visitor visitor = (Visitor) object;
    return age == visitor.age
        && Objects.equals(firstName, visitor.firstName)
        && Objects.equals(lastName, visitor.lastName);
  }

  @Override
  public int hashCode() {

    return (int) lastName.charAt(0) - 65;

  }

  @Override
  public String toString() {
    return "Visitor {"
        + "firstName = '" + firstName + '\''
        + ", lastName = '" + lastName + '\''
        + ", age = " + age
        + '}';
  }
}
