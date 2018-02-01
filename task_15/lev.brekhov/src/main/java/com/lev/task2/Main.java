package com.lev.task2;

public class Main {

  public static void main(String[] args) {
    Employee john = new Programmer("John");
    Employee anton = new Programmer("Anton");
    Employee denis = new Designer("Denis");
    Employee maxim = new QA("Maxim");

    Employee[] enterprise = {john, anton, denis, maxim};

    for (Employee anEnterprise : enterprise) {
      System.out.println(anEnterprise.work());
    }
  }
}