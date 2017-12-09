package com.hillel;

public class Palindromes {

  public static void main(String[] args) {
  }

  public static boolean isPalindrome(String word) {
    char[] wordArray = word.toCharArray();
    int left = 0;
    int right = word.length() - 1;
    for (int i = 0; i < wordArray.length; i++) {
      if (wordArray[left] == wordArray[right]) {
        left++;
        right--;
        if (left >= wordArray.length / 2) {
          return true;
        }
      }
    }
    return false;
  }

  public static String howManyPalindromes(String text) {
    int palindromeCounter = 0;
    String[] textArray = text.split(",");
    for (String word : textArray) {
      if (isPalindrome(word.trim())) {
        palindromeCounter++;
      }
    }
    return "There are " + palindromeCounter + " palindromes in this text";
  }
}
