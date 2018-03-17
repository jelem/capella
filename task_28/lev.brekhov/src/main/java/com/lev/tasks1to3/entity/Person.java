package com.lev.tasks1to3.entity;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Cloneable, Serializable {

  private static final long serialVersionUID = -1;
  private String firstname;
  private String lastname;
  private City city;
  private PersonalData personalData;

  public Person(String firstname, String lastname, City city,
      PersonalData personalData) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.city = city;
    this.personalData = personalData;
  }

  public Person(Person person) {
    this.firstname = person.firstname;
    this.lastname = person.lastname;
    this.city = new City(person.city.getName(), person.city.getCountry());
    this.personalData = new PersonalData(person.personalData.getPassport(),
        person.personalData.getAddress(), person.personalData.getAge());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person person = (Person) obj;
    return Objects.equals(firstname, person.firstname)
        && Objects.equals(lastname, person.lastname)
        && Objects.equals(city, person.city)
        && Objects.equals(personalData, person.personalData);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstname, lastname, city, personalData);
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstname='" + firstname + '\''
        + ", lastname='" + lastname + '\''
        + ", city=" + city
        + ", personalData=" + personalData + '}';
  }

  public Person clonePerson() throws CloneNotSupportedException {
    return (Person) super.clone();
  }
}
