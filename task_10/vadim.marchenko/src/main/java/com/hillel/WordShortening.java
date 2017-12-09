package com.hillel;

public class WordShortening {

  public static void main(String[] args) {

  }

  public static String reduction(String word) {
    char[] wordArray = word.toCharArray();
    if (wordArray.length - 1 >= 3) {
      int charsInBetweenInteger = 0;
      for (int i = 1; i < wordArray.length - 1; i++) {
        charsInBetweenInteger++;
      }
      String charsInBetweenString = Integer.toString(charsInBetweenInteger);
      return wordArray[0] + charsInBetweenString + wordArray[wordArray.length - 1];
    } else {
      return word;
    }
  }
}
