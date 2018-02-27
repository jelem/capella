package ua.pp.darknsoft;

public class Student {

  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
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
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }

    Student student = (Student) obj;

    if (age != student.age) {
      return false;
    }
    if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) {
      return false;
    }
    return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + age;
    return result;
  }

  @Override
  public String toString() {
    return "Student{"
        + "firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", age=" + age
        + '}';
  }
}
