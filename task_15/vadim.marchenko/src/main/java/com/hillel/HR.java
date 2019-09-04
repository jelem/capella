package com.hillel;

public class HR extends Worker {

  public HR(String gender, int age) {
    super(gender, age);
  }

  @Override
  public void work() {
    System.out.println("Recruiting new workers");
  }

}
