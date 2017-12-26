package com.dima;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BoardTests {

  @Test
  public void testFull1() {
    Board board = new Board();
    boolean result = board.isFull();
    assertEquals(result, false);
  }

  @Test
  public void testFull2() {
    Board board = new Board();
    for (int i = 0; i < 4; i++) {
      board.setCell(Board.X, i);
    }
    board.draw();
    boolean result = board.isFull();
    assertEquals(result, false);
  }

  @Test
  public void testIsWinRow() {
    Board board = new Board();
    board.setCell(Board.X, 0);
    board.setCell(Board.X, 1);
    board.setCell(Board.X, 2);
    board.draw();
    boolean actual = board.isWin(Board.X);
    assertEquals(true, actual);
  }

  @Test
  public void testIsWinRow2() {
    Board board = new Board();
    board.setCell(Board.X, 0);
    board.setCell(Board.O, 1);
    board.setCell(Board.X, 2);
    board.draw();
    boolean result = board.isWin(Board.X);
    assertEquals(result, false);
  }

  @Test
  public void testIsWinCol() {
    Board board = new Board();
    board.setCell(Board.O, 0);
    board.setCell(Board.O, 3);
    board.setCell(Board.O, 6);
    board.draw();
    boolean result = board.isWin(Board.O);
    assertEquals(result, true);
  }

  @Test
  public void testIsWinMain() {
    Board board = new Board();
    board.setCell(Board.O, 0);
    board.setCell(Board.O, 4);
    board.setCell(Board.O, 8);
    board.draw();
    boolean result = board.isWin(Board.O);
    assertEquals(result, true);
  }

  @Test
  public void testIsWinOther() {
    Board board = new Board();
    board.setCell(Board.O, 2);
    board.setCell(Board.O, 4);
    board.setCell(Board.O, 6);
    board.draw();
    boolean result = board.isWin(Board.O);
    assertEquals(result, true);
  }

  @Test
  public void testLen() {
    Board board = new Board();
    board.setCell(Board.O, 2);
    board.setCell(Board.O, 4);
    board.setCell(Board.O, 6);
    board.draw();
    int result = board.getLen();
    assertEquals(result, 9 - 3);
  }

  @Test
  public void testLen2() {
    Board board = new Board();
    for (int i = 0; i < 9; i++) {
      board.setCell(Board.X, i);
    }
    board.draw();
    int result = board.getLen();
    assertEquals(result, 0);
  }

  @Test
  public void testLen3() {
    Board board = new Board();
    for (int i = 0; i < 19; i++) {
      board.setCell(Board.X, i);
    }
    board.draw();
    int result = board.getLen();
    assertEquals(result, 0);
  }
}
