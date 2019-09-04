package com.hillel;

public class CEO extends Worker {

  public CEO(String gender, int age) {
    super(gender, age);
  }

  @Override
  public void work() {
    System.out.println("Counting money");
  }

}
