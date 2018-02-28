package ua.pp.darknsoft.ex02.structure;

import ua.pp.darknsoft.ex02.people.Person;

import java.util.Set;

public class ProRectorate extends Rectorate {

  public ProRectorate(String name) {
    super(name);
  }

  public ProRectorate(String name, Set<Person> employees) {
    super(name, employees);
  }

  @Override
  void addEmployee(Person person) {

  }

  @Override
  void removeEmployee(Person person) {

  }
}
