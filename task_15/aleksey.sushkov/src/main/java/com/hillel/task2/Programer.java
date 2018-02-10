package com.hillel.task2;

public class Programer extends Worker {

  public Programer(String name, int zarplata, int age) {
    super(name, zarplata, age);
  }

  @Override
  public void work() {
    System.out.println("I'm programing. What did you think?");
  }

}
