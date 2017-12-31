package com.hillel.second;

public class Main {

  public static void main(String[] args) {
    Worker[] firm = new Worker[5];
    firm[0] = new Programmer("Vasiliy");
    firm[1] = new Programmer("Petya");
    firm[2] = new Designer("Anna");
    firm[3] = new Designer("Alex");
    firm[4] = new Tester("Volodya");

    for (Worker worker : firm) {
      System.out.print("My name is " + worker.getName() + ". ");
      worker.arbeiten();
    }
  }
}
