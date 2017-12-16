package com.hillel.second;

public class Worker {

  private String name;

  public Worker(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void arbeiten() {
    System.out.println("I'm working. ");
  }
}
