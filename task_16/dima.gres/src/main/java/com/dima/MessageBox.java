package com.dima;

public class MessageBox {

  public static void input(char thisChar) {
    System.out.print("Mister " + thisChar + " are moving(0..8): ");
  }

  public static void error() {
    System.out.println("Error input. Please repeat correct move: ");
  }

  public static void congratulations(char result) {
    if (result == Game.DROW) {
      System.out.println("\n...Drow...");
      return;
    }
    System.out.println("\nCongratulations mister " + result + "!");
  }

  public static void ouestion(char ch) {
    System.out.println("Who are you mister " + ch);
    System.out.println("Human\t1");
    System.out.println("Easy\t2");
    System.out.println("Medium\t3");
    System.out.println("\t\t: ");
  }

  public static void errorWho() {
    System.out.println("Error input. Please repeat correct select(1 - 3): ");
  }
}
