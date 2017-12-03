package com.hillel;

import java.util.Scanner;

public class WordPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] arrayStrings = str.split(",");
    int count = 0;
    boolean isPalindrome;

    for (int i = 0; i < arrayStrings.length; i++) {
      arrayStrings[i] = arrayStrings[i].trim();
      isPalindrome = true;
      for (int j = 0; j < arrayStrings[i].length() / 2; j++) {
        if (arrayStrings[i].charAt(j) != arrayStrings[i].charAt(arrayStrings[i].length() - 1 - j)) {
          isPalindrome = false;
        }
      }
      if (isPalindrome) {
        count++;
      }
    }
    System.out.println("We have " + count + " palindromes!!");
  }
}
