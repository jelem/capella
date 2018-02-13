package ua.pp.darknsoft.entity;

public class Consumer {

  private int id;
  private String firstName;
  private String lastName;
  private int age;

  public Consumer(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Consumer(int id, String firstName, String lastName, int age) {
    this(firstName, lastName, age);
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Consumer)) {
      return false;
    }

    Consumer consumer = (Consumer) obj;

    if (id != consumer.id) {
      return false;
    }
    if (age != consumer.age) {
      return false;
    }
    if (!firstName.equals(consumer.firstName)) {
      return false;
    }
    return lastName.equals(consumer.lastName);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + age;
    return result;
  }

  public int getId() {
    return id;
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
  public String toString() {
    return "Consumer{"
        + "id=" + id
        + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + '}';
  }
}
