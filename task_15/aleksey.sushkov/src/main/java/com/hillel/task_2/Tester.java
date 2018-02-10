package com.hillel.task_2;

public class Tester extends Worker {

  public Tester(String name, int zarplata, int age) {
    super(name, zarplata, age);
  }

  @Override
  public void work() {
    System.out.println("I'm testing. All the day.");
  }

}
