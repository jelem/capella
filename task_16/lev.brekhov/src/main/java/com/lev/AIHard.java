package com.lev;

import java.util.Random;

public class AIHard extends Player{

  private String name;
  private char symbol;

  public AIHard(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove(Board board) {
    int min = 1;
    int max = 3;
    Random random = new Random();

    System.out.print("Now, " + this.name + " is moving:");
    boolean isFilled = false;
    while (!isFilled) {
      int xAxis = random.nextInt(max - min + 1) + min;
      int yAxis = random.nextInt(max - min + 1) + min;
      isFilled = board.fillCell(xAxis, yAxis, this.symbol);
      System.out.println();
    }
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return symbol;
  }
}
