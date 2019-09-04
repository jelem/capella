package com.hillel;

public class Developer extends Worker {

  public Developer(String gender, int age) {
    super(gender, age);
  }

  @Override
  public void work() {
    System.out.println("Coding");
  }

}
