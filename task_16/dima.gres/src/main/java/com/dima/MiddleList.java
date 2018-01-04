package com.dima;

public class MiddleList extends EasyList implements AdvanceList {

  private Board buffer;

  public MiddleList() {
    super();
    buffer = new Board();
  }


  @Override
  public int evaluate(Board board, char ch, int index) {
    final char enemy = ch == Board.X ? Board.O : Board.X;
    Board.copy(buffer, board, Board.CLASSIC);
    buffer.setCell(ch, index);
    if (buffer.isWin(ch)) {
      return 10;
    }
    Board.copy(buffer, board, Board.CLASSIC);
    buffer.setCell(enemy, index);
    if (buffer.isWin(enemy)) {
      return 5;
    }
    return 0;
  }

  @Override
  public int max(Board board, int[] array, char ch) {
    int max = 0;
    for (int i = 0; i < board.getLen(); i++) {
      int index = array[i];
      if (evaluate(board, ch, index) > max) {
        max = evaluate(board, ch, index);
      }
    }
    return max;
  }

  @Override
  public void clear() {
    this.setLen(0);
  }

  @Override
  public void add(int num) {
    int len = getLen();
    set(len, num);
    setLen(len + 1);
  }

  @Override
  public int generateMaxRandom(Board board, int[] array, char ch, int max) {
    MiddleList buf = new MiddleList();
    buf.clear();
    for (int i = 0; i < board.getLen(); i++) {
      int index = array[i];
      if (evaluate(board, ch, index) == max) {
        buf.add(index);
      }
    }
    int len = buf.getLen();
    int random = BaseList.createRandom(len);
    return buf.get(random);
  }
}
