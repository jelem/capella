package ua.pp.darknsoft;

import java.util.Comparator;

public class Student implements Comparable<Student> {

  private String name;
  private int age;
  private Address address;

  public Student(String name, int age, Address address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Address getAddress() {
    return address;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Student student = (Student) obj;
    if (!name.equals(student.name)) {
      return false;
    }
    if ((age != student.age)) {
      return false;
    }
    return address.equals(student.address);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    result = 31 * result + address.hashCode();
    return result;
  }

  @Override
  public int compareTo(Student student) {
    return Comparator.comparing(Student::getName).compare(this, student);
  }

  @Override
  public String toString() {
    return "name: " + name + " age: " + age + " address " + address;
  }


}
