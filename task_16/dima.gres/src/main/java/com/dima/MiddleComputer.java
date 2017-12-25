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
    char[][] buf = new char[Board.CLASSIC][Board.CLASSIC];
    board.copyFieldToArray(buf);
    list.fill(buf);
    int max = list.max(board, list.getArray(), getThisChar());
    int index = list.generateMaxRandom(board, list.getArray(), getThisChar(), max);
    board.setCell(getThisChar(), index);
  }

}
