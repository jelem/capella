package com.lev.task_2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "utf-8");
    RepeatedChars line = new RepeatedChars();

    System.out.println("Enter word");

    line.setWord(sc.next());

    System.out.println(line.output(line));
  }
}
