package com.hillel.employees;

public class Main {

  public static void main(String[] args) {

    Builder builder = new Builder("Ivan", 35);
    Surgeon surgeon = new Surgeon("Vlad", 45);
    Cleaner cleaner = new Cleaner("Sergey", 25);

    Employee[] employees = new Employee[5];
    employees[0] = builder;
    employees[1] = surgeon;
    employees[2] = cleaner;

    for (Employee employee : employees) {
      if (employee != null) {
        employee.work();
      }
    }
  }

}
