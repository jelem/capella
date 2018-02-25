package com.hillel;

public class Screen {

  public static void printServices() {
    System.out.println();
    System.out.println("1 - View balance");
    System.out.println("2 - Withdraw money");
    System.out.println("3 - Transfer money");
    System.out.println();
    System.out.println("Enter code:");
  }

  public static void printBalance(int moneys) {
    System.out.println();
    System.out.println("Balance: " + moneys);
    System.out.println();
  }

  public static void print(String text) {
    System.out.println();
    System.out.println(text);
  }
}
