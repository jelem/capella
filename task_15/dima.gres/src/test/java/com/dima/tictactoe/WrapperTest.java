package com.dima.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WrapperTest {

  @Test
  public void isCorrectCoordsTest() {
    Board board = new Board();
    boolean actual = board.isCorrectCoords(3, 3);
    boolean expected = false;
    assertEquals(actual, expected);
  }
}
