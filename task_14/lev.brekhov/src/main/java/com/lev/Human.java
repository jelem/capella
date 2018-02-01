package com.lev;

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
    System.out.println("Makes move: " + this.name);
    Scanner sc = new Scanner(System.in,"utf-8");
    boolean isFilled = false;
    while (!isFilled) {
      System.out.println("Enter coords (x,y), where x,y can be 1-3: ");
      String[] arr = sc.next().split(",");
      int oxAxis = Integer.parseInt(arr[0]);
      int oyAxis = Integer.parseInt(arr[1]);
      isFilled = board.fillCell(oxAxis, oyAxis, this.symbol);
    }
  }

  public String getName() {
    return name;
  }

  public char getSymbol() {
    return symbol;
  }
}