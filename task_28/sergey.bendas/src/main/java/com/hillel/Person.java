package com.hillel;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable, Cloneable {

  private static final long serialVersionUID = 3725007513363868985L;
  private String firstName;
  private String lastName;
  private PersonalData personalData;
  private City city;

  public Person(String firstName, String lastName, PersonalData personalData, City city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.personalData = personalData;
    this.city = city;
  }

  public Person(Person person) {
    this.firstName = person.firstName;
    this.lastName = person.lastName;
    this.personalData = new PersonalData(person.personalData);
    //A new city is not created
    this.city = person.city;

  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public PersonalData getPersonalData() {
    return personalData;
  }

  public City getCity() {
    return city;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Person person = (Person) object;
    return Objects.equals(personalData, person.personalData);
  }

  @Override
  public int hashCode() {

    return Objects.hash(personalData);
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", personalData=" + personalData
        + ", city=" + city
        + '}';
  }

  @Override
  protected Person clone() throws CloneNotSupportedException {
    return (Person) super.clone();
  }
}
