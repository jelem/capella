package com.hillel.Employee;

public class Main {

  public static void main(String[] args) {
    Employee [] company = new Employee[3];
    company[0] = new Vasia("Вася", "Пупкин", 33, 5);
    company[1] = new Petia("Петя", "Пяточкин", 45, 10);
    company[2] = new Misha("Миша", "Курочкин", 53, 24);

    for (Employee employee: company){
      if(company != null){
        employee.work();
      }
    }
  }

}
