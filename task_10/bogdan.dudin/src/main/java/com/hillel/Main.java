package com.hillel;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int task = 0;
    String text;

    System.out.println("Choose a task:");
    System.out.println("1. Replace symbols in email");
    System.out.println("2. i18n");
    System.out.println("3. Palindromes");

    do {
      task = scanner.nextInt();
    }
    while (task != 1 && task != 2 && task != 3);
    scanner.nextLine();

    if (task == 1){
      System.out.print("Enter email: ");
      text = scanner.next();

      System.out.println(StringRefactor.replaceEmailSymbols(text));
    }
    else if (task == 2) {
      System.out.println("Exemple: internationalization localization cat elephant monitor");
      System.out.print("Enter words: ");
      text = scanner.nextLine();

      String[] words = StringRefactor.shortWords(text);

      for (int i = 0; i < words.length; i++) {
        System.out.println(words[i]);
      }
    }
    else if (task == 3) {
      System.out.println("Exemple: deleveled, evitative, cat, dog, deified");
      System.out.print("Enter words: ");
      text = scanner.nextLine();

      System.out.println("Number of palindromes: " + StringRefactor.howMathPalindromes(text));
    }
  }
}
