package com.hillel;

import java.util.Scanner;

public class taskTen {

  public static void main(String[] args) {

    System.out.println("Enter your number: ");
    Scanner enter = new Scanner(System.in);
    int n = enter.nextInt();
    int[] array = new int[10];
    int checkElem = 0;

    for (int i = 0; i < array.length; i++) {
      array[i] = ((int) (Math.random() * 40));
      System.out.println(array[i]);
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        System.out.println(n + " number is on22 position : " + i);
        checkElem += 1;
      }
    }
    if (checkElem == 0) {
      System.out.println("No such element :( try again");
    }
  }
}
