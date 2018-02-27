package com.hillel.second;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Department {

  private String name;
  private Employee master;
  private Set<Employee> employees = new HashSet<>();

  public Department(String name, Employee master) {
    this.name = name;
    this.employees.add(this.master = master);
  }

  String getName() {
    return this.name;
  }

  Employee getMaster() {
    return master;
  }

  Set<Employee> getEmployees() {
    return employees;
  }

  void addEmployee(Employee employee) {
    employees.add(employee);
  }

  @Override
  public abstract String toString();

  public abstract Department getMainDepartment();

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Department that = (Department) object;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name);
  }
}
