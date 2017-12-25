package com.dima;

public abstract class Player {
  private char thisChar;


  public Player(char thisChar) {
    this.thisChar = thisChar;
  }

  public char getThisChar() {
    return thisChar;
  }

  public abstract void makeMove(Board board);
}
