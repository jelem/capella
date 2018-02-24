package com.hillel.task1;

public class Guest {

  private String firstName;
  private String lastName;
  private int age;

  public Guest(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public boolean equals(Object o1) {
    if (this == o1) {
      return true;
    }
    if (o1 == null || getClass() != o1.getClass()) {
      return false;
    }

    Guest guest = (Guest) o1;

    if (age != guest.age) {
      return false;
    }
    if (!firstName.equals(guest.firstName)) {
      return false;
    }
    return lastName.equals(guest.lastName);
  }

  @Override
  public int hashCode() {
    return lastName.charAt(0) - 65;
  }

  @Override
  public String toString() {
    return "Guest\n " +
        "\tfirstName: '" + firstName +
        "\n\tlastName: '" + lastName +
        "\n\tage: " + age;
  }
}
