package com.hillel.second;

import java.util.Objects;

public class Employee {

  private String name;
  private int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Employee employee = (Employee) object;
    return age == employee.age
        && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Employee{"
        + "name='" + name + '\''
        + ", age=" + age
        + '}';
  }
}
