package com.dima;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {

  @Test
  public void testFillSmartCurrentWin() {
    Board board = new Board();
    board.fill(board.X, 0);
    board.fill(board.X, 1);
    int actual = board.evaluate(2, board.X);
    int expected = 10;
    assertEquals(actual, expected);
  }

  @Test
  public void testFillSmartEnemyDefeat() {
    Board board = new Board();
    board.fill(board.X, 0);
    board.fill(board.X, 1);
    int actual = board.evaluate(2, board.O);
    int expected = 0;
    assertEquals(actual, expected);
  }

  @Test
  public void testFillSmartNeutral() {
    Board board = new Board();
    board.fill(board.X, 0);
    board.fill(board.X, 1);
    int actual = board.evaluate(3, board.X);
    int expected = -10;
    assertEquals(actual, expected);
  }

  @Test
  public void testFillSmartWinDef() {
    Board board = new Board();
    board.fill(board.X, 0);
    board.fill(board.X, 1);
    board.fill(board.O, 3);
    board.fill(board.O, 4);
    boolean actual = board.evaluate(2, Board.X) > board.evaluate(5, Board.X);
    boolean expected = true;
    assertEquals(actual, expected);
  }

}
