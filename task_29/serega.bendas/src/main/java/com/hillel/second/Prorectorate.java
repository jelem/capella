package com.hillel.second;

public class Prorectorate extends Department {

  private Rectorate main;

  public Prorectorate(String name, Employee master, Rectorate main) {
    super(name, master);
    this.main = main;
  }

  @Override
  public String toString() {
    return "{Prorectorate: " + "\n"
        + "name: " + getName() + "\n"
        + "master: " + getMaster() + "\n"
        + "rectorate: " + getMainDepartment().getName() + "}\n";
  }

  @Override
  public Department getMainDepartment() {
    return main;
  }
}
