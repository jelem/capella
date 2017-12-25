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
    int[] buffer = new int[Board.CLASSIC * Board.CLASSIC];
    list.copyIntArrToBuffer(buffer);
    int max = list.max(board, buffer, getThisChar());
    int index = list.generateMaxRandom(board, buffer, getThisChar(), max);
    board.setCell(getThisChar(), index);
  }

}
