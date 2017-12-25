package com.dima;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiddleListTest {

  @Test
  public void evaluateTest() {
    int len = Board.CLASSIC * Board.CLASSIC;
    MiddleList middleList = new MiddleList();
    Board board = new Board();
    int actual = middleList.evaluate(board, board.X, 0);
    for (int i = 0; i < len; i++) {
      actual = middleList.evaluate(board, board.X, i);
      assertEquals(0, actual);
    }

  }
}
