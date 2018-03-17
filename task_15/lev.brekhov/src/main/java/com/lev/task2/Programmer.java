package com.lev.task2;

public class Programmer extends Employee {

  private String name;

  public Programmer(String name) {
    this.name = name;
  }

  public String work() {
    return "Programmer " + getName() + " is working!";
  }

  public String getName() {
    return name;
  }
}