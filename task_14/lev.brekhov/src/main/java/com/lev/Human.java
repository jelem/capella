package com.lev;

import java.util.Scanner;

public class Human extends Player {

  private String name;
  private char symbol;

  public Human(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove() {
    System.out.println("Makes move: " + this.name);
    Scanner sc = new Scanner(System.in);
    boolean isFilled = false;
    while (!isFilled) {
      System.out.println("Enter coords (x,y), where x,y can be 1-3: ");
      String[] arr = sc.next().split(",");
      int x = Integer.parseInt(arr[0]);
      int y = Integer.parseInt(arr[1]);
      isFilled = Board.fillCell(x, y, this.symbol);
    }
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return symbol;
  }
}