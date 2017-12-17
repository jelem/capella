package com.hillel.second;

public class Main {

  public static void main(String[] args) {

    Employee director = new Director("Vasiliy", 7000);
    Employee builder = new Builder("Ivan", 4000);
    Employee accountant = new Accountant("Olga", 5000);

    Employee[] firm = new Employee[3];
    firm[0] = director;
    firm[1] = builder;
    firm[2] = accountant;

    for (Employee helper : firm) {
      System.out.print(helper.getName() + "(" + helper.getSalary() + ")" + ": ");
      helper.work();
    }

  }
}
