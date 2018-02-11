package com.hillel;

import java.util.Scanner;

public class MyScanner {

  public static int getInt(String string) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println(string);
    return scanner.nextInt();
  }

  public static String getString(String string) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    System.out.println(string);
    return scanner.nextLine();
  }
}