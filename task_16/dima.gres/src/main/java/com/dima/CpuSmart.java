package com.dima;

public class CpuSmart extends Player {
  @Override
  public void makeMove(Board board) {
    board.fillSmart(this.getSignature());
  }

  public CpuSmart(char signature) {
    super(signature);
  }
}
