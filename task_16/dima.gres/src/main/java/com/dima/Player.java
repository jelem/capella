package com.dima;

public abstract class Player {
  private char signature;

  public abstract void makeMove(Board board);

  public char getSignature() {
    return signature;
  }

  public Player(char signature) {
    this.signature = signature;
  }
}
