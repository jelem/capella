package com.hillel;

public class Palindromes {


  public static int findPalindromes1(String str) {
    int count = 0;

    String[] arStr = str.split(",");

    for (String string : arStr) {
      string = string.trim();
      char[] arChar = string.toCharArray();
      StringBuilder newString = new StringBuilder();
      for (int i = arChar.length - 1; i >= 0; i--) {
        newString.append(arChar[i]);
      }
      if (string.equals(newString.toString())) {
        count++;
      }
    }
    System.out.println("There are " + count + " palindromes in the text");

    return count;
  }

  public static int findPalindromes2(String str) {
    int count = 0;
    String[] arStr = str.split(",");

    for (String string : arStr) {
      string = string.trim();
      StringBuilder stringBuilder = new StringBuilder(string);
      if (string.equals(stringBuilder.reverse().toString())) {
        count++;
      }
    }
    System.out.println("There are " + count + " palindromes in the text");

    return count;
  }

}
