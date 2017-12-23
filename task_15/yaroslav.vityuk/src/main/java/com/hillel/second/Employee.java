package com.hillel.second;

public class Employee {

  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
  }

  public void work() {
    System.out.println("I'm working");
  }
}
