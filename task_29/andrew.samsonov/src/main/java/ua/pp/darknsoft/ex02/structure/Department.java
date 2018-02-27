package ua.pp.darknsoft.ex02.structure;

import ua.pp.darknsoft.ex02.people.Person;
import ua.pp.darknsoft.ex02.people.Position;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Department implements Comparable<Department> {

  private String name;
  private Set<Person> employees;

  public Department(String name) {
    this.name = name;
  }

  public Department(String name, Set<Person> employees) {
    this.name = name;
    this.employees = employees;
  }

  public Set<Person> getBosses() {
    Set<Person> bosses = new HashSet<>();
    for (Person employee : this.employees) {
      if (employee.getPosition() == Position.MASTER) {
        bosses.add(employee);
      }
    }
    return bosses;
  }

  public Set<Person> getSubordinate() {
    Set<Person> subs = new HashSet<>();
    for (Person employee : this.employees) {
      if (employee.getPosition() == Position.SLAVE) {
        subs.add(employee);
      }
    }
    return subs;
  }

  public String getName() {
    return name;
  }

  abstract void addEmployee(Person person);

  abstract void removeEmployee(Person person);

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Department)) {
      return false;
    }
    Department that = (Department) obj;
    return Objects.equals(name, that.name)
        && Objects.equals(employees, that.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, employees);
  }

  @Override
  public int compareTo(Department department) {
    return this.name.compareTo(department.name);
  }

}
