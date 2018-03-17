package com.lev.task_1;

import java.util.Objects;

public class Lodger {

  private String firstName;
  private String lastName;

  public Lodger(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lodger lodger = (Lodger) o;
    return Objects.equals(firstName, lodger.firstName) &&
        Objects.equals(lastName, lodger.lastName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(lastName.charAt(0));
  }

  public String getLastName() {
    return lastName;
  }
}
