package com.hillel;

import java.util.Scanner;

public class ShortWords {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    String words = scanner.nextLine();
    shortThisWords(words);
  }

  public static String[] shortThisWords(String check) {
    String[] wordsArray = stringToArray(check);
    String empty = "";
    for (int i = 0; i < wordsArray.length; i++) {
      if (wordsArray[i].length() > 4) {
        char chFirst = wordsArray[i].charAt(0);
        char chLast = wordsArray[i].charAt(wordsArray[i].length() - 1);
        wordsArray[i] = empty + chFirst + (wordsArray[i].length() - 2) + chLast;
        System.out.println(wordsArray[i]);
      } else {
        System.out.println(wordsArray[i]);
      }
    }
    return wordsArray;
  }

  public static String[] stringToArray(String words) {
    return words.split(" ");
  }
}
