package com.hillel.second;

public class Tester extends Worker {

  public Tester(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void arbeiten() {
    System.out.println("I'm testing program. ");
  }
}
