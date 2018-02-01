package com.lev.task2;

public class QA extends Employee {

  private String name;

  public QA(String name) {
    this.name = name;
  }

  public String work() {
    return "QA " + getName() + " is working!";
  }

  public String getName() {
    return name;
  }
}