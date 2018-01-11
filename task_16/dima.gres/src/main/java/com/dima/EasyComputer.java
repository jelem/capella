package com.dima;

public class EasyComputer extends Player {
  private BaseList list;

  public EasyComputer(char thisChar) {
    super(thisChar);
    list = new EasyList();
  }

  @Override
  public void makeMove(Board board) {
    char[][] buf = new char[Board.CLASSIC][Board.CLASSIC];
    board.copyFieldToArray(buf);
    list.fill(buf);
    int random = list.createRandom();
    int index = list.get(random);
    board.setCell(getThisChar(), index);
  }
}
