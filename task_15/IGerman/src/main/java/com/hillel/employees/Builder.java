package com.hillel.employees;

public class Builder extends Employee {

  public Builder(String name, int age) {
    super(name, age);
  }

  public void work() {
    System.out.println("I'm building");
  }
}
