package com.hillel;

import java.util.Objects;
import java.util.Scanner;

public class Human {

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Human human = (Human) object;
    return age == human.age &&
        Objects.equals(name, human.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, age);
  }


  public void insertCard(Card card, ATM atm) {
    atm.insertCard(this, card);
  }

  public int enterPinCode() {
    Scanner scanner = new Scanner(System.in);
    int pin = scanner.nextInt();
    if (pin < 1000 || pin > 9999) {
      throw new RuntimeException("Wrong pin code");
    }
    return pin;
  }

  public void selectService(ATM atm) {
    atm.printServices();
    Scanner scanner = new Scanner(System.in);
    int serviceNum = scanner.nextInt();
    switch (serviceNum) {
      case 1:
        atm.viewBalance();
        break;
      case 2:
        atm.withdrawMoney(this);
        break;
      case 3:
        atm.moneyTransfer(this);
        break;
      default:
    }
  }

  public int enterMoneys() {
    Scanner scanner = new Scanner(System.in);
    int moneys = scanner.nextInt();
    if (moneys < 1) {
      throw new RuntimeException("Wrong value");
    }
    return moneys;
  }

  public int enterAccountForTransfer() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  public void backCard(ATM atm) {
    atm.backCard();
  }
}
