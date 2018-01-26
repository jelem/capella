package com.hillel.employees;

public class Cleaner extends Employee {

  public Cleaner(String name, int age) {
    super(name, age);
  }

  public void work() {
    System.out.println("I'm cleaning");
  }
}
