package com.lev;

import java.util.Random;

public class AI extends Player {

  private String name;
  private char symbol;

  public AI(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove() {
    int min = 1;
    int max = 3;
    Random random = new Random();

    System.out.print("Now, " + this.name + " is moving:");
    boolean isFilled = false;
    while (!isFilled) {
      int xCoord = random.nextInt(max - min + 1) + min;
      int yCoord = random.nextInt(max - min + 1) + min;
      isFilled = Board.fillCell(xCoord, yCoord, this.symbol);
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
