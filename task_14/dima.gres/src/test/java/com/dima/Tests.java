package com.dima;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Tests {

  @Test
  public void testGameFinished_I() {
    char[][] board = new char[3][3];
    MainApp.fillBoard(board);
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, false);
  }

  @Test
  public void testGameFinished_II() {
    char[][] board = {
            {'x','x','y'},
            {'y','y','x'},
            {'x','x','y'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }

  @Test
  public void testGameFinished_III() {
    char[][] board = {
            {'x','x',' '},
            {'y','y','x'},
            {'x','x','y'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, false);
  }

  @Test
  public void testGameFinished_IV() {
    char[][] board = {
            {'x','x','x'},
            {'y','y',' '},
            {'x','x','y'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }

  @Test
  public void testGameFinished_V() {
    char[][] board = {
            {'x','y','y'},
            {'x','y',' '},
            {'x','x','y'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }

  @Test
  public void testGameFinished_VI() {
    char[][] board = {
            {'x','y','y'},
            {'y','x',' '},
            {'x','y','x'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }

  @Test
  public void testGameFinished_VII() {
    char[][] board = {
            {'y','y','x'},
            {'y','x',' '},
            {'x','y','x'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }

  @Test
  public void testGameFinishedY_I() {
    char[][] board = {
            {'y','y','y'},
            {'x',' ','x'},
            {'y','x','x'}
    };
    boolean actual = MainApp.gameFinished(board);
    assertEquals(actual, true);
  }


}
