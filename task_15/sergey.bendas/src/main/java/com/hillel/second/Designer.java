package com.hillel.second;

public class Designer extends Worker {

  public Designer(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void arbeiten() {
    System.out.println("I'm making program design. ");
  }
}
