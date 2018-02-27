package ua.pp.darknsoft.ex02.structure;

import ua.pp.darknsoft.ex02.people.Person;

import java.util.Set;

public class Chair extends Faculty {

  public Chair(String name) {
    super(name);
  }

  public Chair(String name, Set<Person> employees) {
    super(name, employees);
  }

  @Override
  void addEmployee(Person person) {

  }

  @Override
  void removeEmployee(Person person) {

  }
}
