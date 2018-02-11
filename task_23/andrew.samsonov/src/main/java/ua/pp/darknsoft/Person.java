package ua.pp.darknsoft;

/**
 * Created by Andrew on 03.02.2018.
 */
public class Person {

  private String firstName;
  private String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
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

    if (age != person.age) {
      return false;
    }
    if (!firstName.equals(person.firstName)) {
      return false;
    }
    return lastName.equals(person.lastName);
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + age;
    return result;
  }

  @Override
  public String toString() {
    return "Person{"
        + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age
        + '}';
  }
}
