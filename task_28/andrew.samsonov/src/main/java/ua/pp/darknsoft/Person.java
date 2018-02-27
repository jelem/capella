package ua.pp.darknsoft;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable, Cloneable {

  private static final long serialVersionUID = 1856835860954L;

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
    this.firstName = person.firstName;
    this.lastName = person.lastName;
    this.city = new City(person.city);
    this.personalData = new PersonalData(person.personalData);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Person person = (Person) super.clone();
    person.city = (City) this.city.clone();
    person.personalData = (PersonalData) this.personalData.clone();
    return person;
  }

  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
    stream.defaultReadObject();
    //here we can check some fields in a deserializable object;
    if (lastName == null) {
      throw new IllegalArgumentException();
    }
  }

  private void writeObject(ObjectOutputStream stream) throws IOException {
    stream.defaultWriteObject();
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

    if (!firstName.equals(person.firstName)) {
      return false;
    }
    if (!lastName.equals(person.lastName)) {
      return false;
    }
    if (city != null ? !city.equals(person.city) : person.city != null) {
      return false;
    }
    return personalData != null ? personalData.equals(person.personalData)
        : person.personalData == null;
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (personalData != null ? personalData.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Person{"
        +
        "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", city=" + city
        + ", personalData=" + personalData
        + '}';
  }
}
