package ua.pp.darknsoft.entity;

public class Author {

  private int id;
  private String firstName;
  private String lastName;
  private int age;

  public Author(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Author(int id, String firstName, String lastName, int age) {
    this(firstName, lastName, age);
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Author)) {
      return false;
    }

    Author author = (Author) obj;

    if (id != author.id) {
      return false;
    }
    if (age != author.age) {
      return false;
    }
    if (!firstName.equals(author.firstName)) {
      return false;
    }
    return lastName.equals(author.lastName);
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
    return "Author{"
        + "id=" + id
        + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + '}';
  }
}
