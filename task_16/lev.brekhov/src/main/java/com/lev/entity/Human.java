package com.lev.entity;

import java.util.Scanner;

public class Human extends Player {

  private String name;
  private char symbol;

  public Human(String name, char symbol) {
    super(name, symbol);
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove(Board board) {
    System.out.println("Your turn");
    Scanner sc = new Scanner(System.in, "utf-8");
    boolean isFilled = false;
    while (!isFilled) {
      System.out.println("Enter coords (x,y), where x,y can be 1-3: ");
      String[] arr = sc.next().split(",");
      int oxAxis = Integer.parseInt(arr[0]);
      int oyAxis = Integer.parseInt(arr[1]);

      while (true) {
        if (oxAxis > 3 || oxAxis < 1 || oyAxis > 3 || oyAxis < 1) {
          System.out.println("Please, pick from 1 to 3");
          arr = sc.next().split(",");
          oxAxis = Integer.parseInt(arr[0]);
          oyAxis = Integer.parseInt(arr[1]);
        } else {
          break;
        }
      }
      isFilled = board.fillCell(oxAxis, oyAxis, this.symbol);
    }
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return this.symbol;
  }
}