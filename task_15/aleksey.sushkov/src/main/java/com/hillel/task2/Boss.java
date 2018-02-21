package com.hillel.task2;

public class Boss extends Worker {

  public Boss(String name, int zarplata, int age) {
    super(name, zarplata, age);
  }

  @Override
  public void work() {
    System.out.println("I'm rule over all of you.");
  }

}
