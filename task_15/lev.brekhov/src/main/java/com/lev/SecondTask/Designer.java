package com.lev.SecondTask;

public class Designer extends Employee {

  private String name;

  public Designer(String name) {
    this.name = name;
  }

  public String work() {
    return "Designer " + getName() + " is working!";
  }

  public String getName() {
    return name;
  }
}