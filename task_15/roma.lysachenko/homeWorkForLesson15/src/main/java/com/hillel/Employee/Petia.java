package com.hillel.Employee;

public class Petia extends  Employee{

  public Petia(String name, String lastName, int age, double experience) {
    super(name, lastName, age, experience);
  }

  public void eat (){
    System.out.println("Petia is eating");
  }

  @Override
  public void work() {
    System.out.println("Petia is working!");
  }
}
