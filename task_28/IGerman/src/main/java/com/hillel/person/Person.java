package com.hillel.person;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable, Cloneable {

  private static final long serialVersionUID = 1;

  private String firstName;
  private String lastName;
  private City city;
  private PersonalData personalData;

  public Person(String firstName, String lastName, City city, PersonalData personalData) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.city = city;
    this.personalData = personalData;

  }

  public Person(Person person) {
    this.firstName = String.valueOf(person.firstName);
    this.lastName = String.valueOf(person.lastName);
    this.city = new City(person.city);
    this.personalData = new PersonalData(person.personalData);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public PersonalData getPersonalData() {
    return personalData;
  }

  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }


  @Override
  protected Person clone() throws CloneNotSupportedException {
    Person person = (Person) super.clone();
    person.city = this.city.clone();
    person.personalData = this.personalData.clone();
    return person;
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
    return Objects.equals(firstName, person.firstName)
        && Objects.equals(lastName, person.lastName)
        && Objects.equals(city, person.city)
        && Objects.equals(personalData, person.personalData);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName, city, personalData);
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", city=" + city
        + ", personalData=" + personalData
        + '}';
  }
}
