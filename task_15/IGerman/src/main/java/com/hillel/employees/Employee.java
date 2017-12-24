package com.hillel.employees;

public class Employee {

  private String name;
  private int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void work() {
    System.out.println("I'm working. My name " + name + ", I'm " + age + " years old");
  }
}
