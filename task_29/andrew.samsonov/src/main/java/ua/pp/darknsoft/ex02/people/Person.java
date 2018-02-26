package ua.pp.darknsoft.ex02.people;

import java.util.Objects;

public class Person implements Comparable<Person> {

  private String firstName;
  private String lastName;
  private int ipn;
  private Position position;

  public Person(String firstName, String lastName, Position position, int ipn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.ipn = ipn;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getIpn() {
    return ipn;
  }

  public Position getPosition() {
    return position;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Person)) {
      return false;
    }
    Person person = (Person) obj;
    return ipn == person.ipn &&
        Objects.equals(firstName, person.firstName) &&
        Objects.equals(lastName, person.lastName) &&
        position == person.position;
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName, ipn, position);
  }

  @Override
  public int compareTo(Person person) {
    return this.lastName.compareTo(person.lastName);
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", ipn=" + ipn
        + ", position=" + position
        + '}';
  }
}
