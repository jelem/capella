package com.dima;

public class Conversation {
  public static void errorMessage(char signature) {
    System.out.println("Error... Mister " + signature + " Please input correct data: ");
  }

  public static void inputMessage(char signature) {
    System.out.println("Mister " + signature + " your move: ");
  }

  public static void Message(String result) {
    System.out.println(result);
  }
}
