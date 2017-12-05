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
      isPalindrome = isWordPalimdrome(arrayStrings[i]);
      if (isPalindrome) {
        count++;
      }
    }
    System.out.println("We have " + count + " palindromes!!");
  }

  public static boolean isWordPalimdrome(String word) {

    boolean isPalindrome = true;
    for (int j = 0; j < word.length() / 2; j++) {
      if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }
}
