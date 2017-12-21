package com.hillel.second;

public class Accountant extends Employee {

  public Accountant(String name, int salary) {
    super(name, salary);
  }

  public void work() {
    System.out.println("I'm counting all your salaries");
  }

  public int getSalary() {
    return super.getSalary();
  }

  public String getName() {
    return super.getName();
  }
}
