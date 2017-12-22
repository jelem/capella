package com.hillel.Employee;

public class Vasia extends Employee {

  public Vasia(String name, String lastName, int age, double experience) {
    super(name, lastName, age, experience);
  }

  public void relax (){
    System.out.println("Vasia is relaxing!");
  }

  @Override
  public void work() {
    System.out.println("Vasia is working!");
  }
}
