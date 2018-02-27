package com.hillel.second;

public class Chair extends Department {

  private Faculty main;

  public Chair(String name, Employee master, Faculty main) {
    super(name, master);
    this.main = main;
  }

  @Override
  public String toString() {
    return "{Chair: " + "\n"
        + "name: " + getName() + "\n"
        + "master: " + getMaster() + "\n"
        + "faculty: " + getMainDepartment().getName() + "}\n";
  }

  @Override
  public Department getMainDepartment() {
    return main;
  }
}
