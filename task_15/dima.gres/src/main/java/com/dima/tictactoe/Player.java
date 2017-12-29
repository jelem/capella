package com.dima.tictactoe;

public class Player {
  
  private String name;
  private char signature;

  public Player(char signature) {
    this.signature = signature;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getSignature() {
    return signature;
  }

  public String getName() {
    return name;
  }
}
