package com.hillel.second;

public class Builder extends Employee {

  public Builder(String name, int salary) {
    super(name, salary);
  }

  public String getName() {
    return super.getName();
  }

  public int getSalary() {
    return super.getSalary();
  }


  public void work() {
    System.out.println("I'm building new house");
  }


}
