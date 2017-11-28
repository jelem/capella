package com.hillel.bendas;

import java.util.stream.Stream;

public class TaskTwo {

  public static String cutWordsInString(String str) {
    String[] arrayOfWords = str.split(" ");
    for (int i = 0; i < arrayOfWords.length; i++) {
      arrayOfWords[i] = catWord(arrayOfWords[i]);
    }
    return Stream.of(arrayOfWords)
        .reduce((first, next) -> first + " " + next)
        .orElse("");
  }

  private static String catWord(String word) {
    int len = word.length();
    return len <= 4 ? word
        : (Character.toString(word.charAt(0)) + (len - 2) + word.charAt(len - 1));
  }
}
