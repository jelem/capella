package com.hillel.employees;

public class Surgeon extends Employee {

  public Surgeon(String name, int age) {
    super(name, age);
  }

  public void work() {
    System.out.println("I'm operating");
  }
}
