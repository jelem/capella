package com.hillel.employees;

public class Employee {

   String name;
   int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void work() {
    System.out.println("I'm working");
  }
}
