package com.hillel.task2;

public class Main {

  public static void main(String[] args) {
    String letter = "abkaw";
    System.out.println(repeatSymb(letter));
  }

  private static boolean repeatSymb(String letter) {
    for (int i = 0; i < letter.length(); i++) {
      for (int j = 0; j < letter.length(); j++) {
        if (i !=j && letter.charAt(i) == letter.charAt(j)) {
          return true;
        }
      }
    }
    return false;
  }


}
