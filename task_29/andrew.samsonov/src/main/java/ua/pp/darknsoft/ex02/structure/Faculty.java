package ua.pp.darknsoft.ex02.structure;

import ua.pp.darknsoft.ex02.people.Person;

import java.util.Set;

public class Faculty extends ProRectorate {

  public Faculty(String name) {
    super(name);
  }

  public Faculty(String name, Set<Person> employees) {
    super(name, employees);
  }

  @Override
  void addEmployee(Person person) {

  }

  @Override
  void removeEmployee(Person person) {

  }

}
