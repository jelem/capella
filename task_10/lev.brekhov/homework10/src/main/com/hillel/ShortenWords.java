package com.hillel;

import java.util.Scanner;

public class ShortenWords {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] arrayStrings = str.split(" ");

    for (int i = 0; i < arrayStrings.length; i++) {
      if (arrayStrings[i].length() >= 4) {
        System.out.print(fullStr(arrayStrings[i]) + " ");
      } else {
        System.out.print(arrayStrings[i] + " ");
      }
    }
  }

  private static String fullStr(String s) {

    return (s.substring(0, 1) + (s.length() - 2) + s.substring(s.length() - 1, s.length()));
  }
}
