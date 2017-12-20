package com.lev.SecondTask;

public class Main {

  public static void main(String[] args) {
    Employee john = new Programmer("John");
    Employee tolya = new Programmer("Tolya");
    Employee denis = new Designer("Denis");
    Employee maxim = new QA("Maxim");

    System.out.println(john.work() + "\n" + tolya.work() + "\n" + denis.work() + "\n" + maxim.work());


  }
}
