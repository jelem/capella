package com.hillel.task2;

public class Worker {

  private String name;
  private int zarplata;
  private int age;

  public Worker(String name, int zarplata, int age) {
    this.name = name;
    this.zarplata = zarplata;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getZarplata() {
    return zarplata;
  }

  public int getAge() {
    return age;
  }

  public void work() {
    System.out.println("I'm working.");
  }

}
