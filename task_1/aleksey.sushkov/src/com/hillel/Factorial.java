package com.hillel;

import java.util.Scanner;

public class Factorial {

  public static void main(String... args) {

    int res = 1;
    System.out.print("Enter number: ");
    Scanner scanner = new Scanner(System.in);
    int fact = scanner.nextInt();

    if (fact <= 0) {
      System.out.println("Illegal data");
      return;
    }

    for (int i = 2; i <= fact; i++) {
      res *= i;
    } 

    System.out.print("Your factorial is " + res);
    
  }

}