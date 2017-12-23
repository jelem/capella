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

  @Test
  public void evaluateTest2() {
    int len = Board.CLASSIC * Board.CLASSIC;
    MiddleList middleList = new MiddleList();
    Board board = new Board();
    board.setCell(Board.X, 0);
    board.setCell(Board.X, 1);
    middleList.fill(board.getField());
    int actual = middleList.evaluate(board, Board.X, 2);
    assertEquals(10, actual);
    actual = middleList.evaluate(board, Board.O, 2);
    assertEquals(5, actual);
  }

  @Test
  public void maxTest() {
    int len = Board.CLASSIC * Board.CLASSIC;
    MiddleList middleList = new MiddleList();
    Board board = new Board();
    board.setCell(Board.X, 0);
    board.setCell(Board.X, 1);
    middleList.fill(board.getField());
    int actual = middleList.max(board, middleList.getArray(), Board.X);
    assertEquals(10, actual);
    actual = middleList.max(board, middleList.getArray(), Board.O);
    assertEquals(5, actual);
  }

}
