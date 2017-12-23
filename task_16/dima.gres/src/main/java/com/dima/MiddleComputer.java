package com.dima;

public class MiddleComputer extends Player {
  private MiddleList list;

  public MiddleComputer(char thisChar) {
    super(thisChar);
    list = new MiddleList();
  }

  public MiddleList getList() {
    return list;
  }

  @Override
  public void makeMove(Board board) {
    list.fill(board.getField());
    int max = list.max(board, list.getArray(), getThisChar());
    int index = list.generateMaxRandom(board, list.getArray(), getThisChar(), max);
    System.out.println("makeMove index: " + index);
    board.setCell(getThisChar(), index);
  }

}
