package com.hillel.Employee;

public class Misha extends Employee {

  public Misha(String name, String lastName, int age, double experience) {
    super(name, lastName, age, experience);
  }

  public void play(){
    System.out.println("Misha is playing!");
  }

  @Override
  public void work() {
    System.out.println("Misha is working!");
  }
}

