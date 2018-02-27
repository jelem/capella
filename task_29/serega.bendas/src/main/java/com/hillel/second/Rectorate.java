package com.hillel.second;

public class Rectorate extends Department {

  public Rectorate(String name, Employee master) {
    super(name, master);
  }

  @Override
  public String toString() {
    return "{Rectorate: \n"
        + "name: " + getName() + "\n"
        + "master: " + getMaster() + "}\n";
  }

  @Override
  public Department getMainDepartment() {
    throw new RuntimeException("Rectorate has no main department");
  }
}
