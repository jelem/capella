package com.hillel.second;

public class Programmer extends Worker {

  public Programmer(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void arbeiten() {
    System.out.println("I'm developing the program. ");
  }
}
