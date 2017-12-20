package com.dima;

import java.util.Vector;

public class CpuEasy extends Player {

  @Override
  public void makeMove(Board board) {
    board.fillRandome(this.getSignature());
  }



  public CpuEasy(char ch) {
    super(ch);
  }
}
