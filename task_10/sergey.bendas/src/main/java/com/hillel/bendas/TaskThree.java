package com.hillel.bendas;

public class TaskThree {

  public static int countPalindromes(String str) {
    String[] strArray = str.split(",");
    int count = 0;
    for (String word : strArray) {
      word = word.trim();
      if (isPalindrome(word)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isPalindrome(String word) {
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
