package com.lev.ais;

import com.lev.entity.Board;
import com.lev.entity.Player;

import java.util.Random;

public class AIEasy extends Player {

  private String name;
  private char symbol;

  public AIEasy(String name, char symbol) {
    super(name, symbol);
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
      int oxAxis = random.nextInt(max - min + 1) + min;
      int oyAxis = random.nextInt(max - min + 1) + min;
      isFilled = board.fillCell(oxAxis, oyAxis, this.symbol);
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
