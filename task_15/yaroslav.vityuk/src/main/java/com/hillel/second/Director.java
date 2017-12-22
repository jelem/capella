package com.hillel.second;

public class Director extends Employee {

  public Director(String name, int salary) {
    super(name, salary);
  }

  public String getName() {
    return super.getName();
  }

  public int getSalary() {
    return super.getSalary();
  }

  public void work() {
    System.out.println("I'm managing all employees");
  }
}
