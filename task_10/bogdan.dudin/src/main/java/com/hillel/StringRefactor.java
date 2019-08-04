package com.hillel;

public class StringRefactor {

  public static String replaceEmailSymbols(String email) {
    email = email.replace("@", "[ at ]");
    email = email.replace(".", "[ dot ]");
    return email;
  }

  public static String[] shortWords(String text) {
    String[] words = text.split(" ");

    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > 3) {
        words[i] =
            Character.toString(words[i].charAt(0)) +
            Integer.toString(words[i].length() - 2) +
            Character.toString(words[i].charAt(words[i].length() - 1));
      }
    }
    return words;
  }

  public static int howMathPalindromes(String text) {
    String[] words = text.split(",");

    int k = 0;

    for (int i = 0; i < words.length; i++) {
      String wordMirror = "";

      words[i] = words[i].trim();

      for (int j = words[i].length() - 1; j >= 0; j--) {
        wordMirror += Character.toString(words[i].charAt(j));
      }
      if (words[i].equals(wordMirror)) {
        k++;
      }
    }
    return k;
  }
}
