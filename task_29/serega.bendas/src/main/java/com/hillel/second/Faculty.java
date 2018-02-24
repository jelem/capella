package com.hillel.second;

public class Faculty extends Department {

  private Prorectorate main;

  public Faculty(String name, Employee master, Prorectorate main) {
    super(name, master);
    this.main = main;
  }

  @Override
  public String toString() {
    return "{Faculty: " + "\n"
        + "name: " + getName() + "\n"
        + "master: " + getMaster() + "\n"
        + "prorectoreate: " + getMainDepartment().getName() + "}\n";
  }

  @Override
  public Department getMainDepartment() {
    return main;
  }
}
