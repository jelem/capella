package com.lev;

import java.util.Scanner;

public class Human extends Player {

  private String name;
  private char symbol;

  public Human(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove(Board board) {
    System.out.println("Makes move: " + this.name);
    Scanner sc = new Scanner(System.in);
    boolean isFilled = false;
    while (!isFilled) {
      System.out.println("Enter coords (x,y), where x,y can be 1-3: ");
      String[] arr = sc.next().split(",");
      int xAxis = Integer.parseInt(arr[0]);
      int yAxis = Integer.parseInt(arr[1]);
      isFilled = board.fillCell(xAxis, yAxis, this.symbol);
    }
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return symbol;
  }
}