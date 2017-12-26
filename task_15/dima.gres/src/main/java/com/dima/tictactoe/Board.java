package com.dima.tictactoe;

public class Board {
  private static final int CLASSICAL = 3;
  private static final char SPACE = ' ';

  private int row = CLASSICAL;
  private int col = CLASSICAL;
  private char terminate = SPACE;

  public void setCell(char ch, int row, int col) {
    this.array[row][col] = ch;
  }

  private char[][] array = new char[CLASSICAL][CLASSICAL];

  public Board() {
    fillArray();
  }

  public void fillArray() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        array[i][j] = terminate;
      }
    }
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public char getTerminate() {
    return terminate;
  }

  public char getCell(int row, int col) {
    return array[row][col];
  }

  public boolean isCorrectCoords(int row, int col) {
    return !isOutOfRange(row , col) && !isBusyplace(row , col);
  }

  private boolean isOutOfRange(int row, int col) {
    return row < 0 || row > this.row - 1
            || col < 0 || col > this.col - 1;
  }

  private boolean isBusyplace(int row, int col) {
    return array[row][col] != terminate;
  }

  public boolean isFilled() {
    for (int i = 0; i < this.row; i++) {
      for (int j = 0; j < this.col; j++) {
        if (this.array[i][j] == terminate) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isWinner(Player winner) {
    char ch = winner.getSignature();
    return isWinCombLine(ch) || isWinCombCol(ch) || isWinCombMain(ch) || isWinCombSide(ch);
  }

  private boolean isWinCombSide(char ch) {
    for (int i = 0; i < row; i++) {
      if (array[i][row - 1 - i] != ch) {
        return false;
      }
    }
    return true;
  }

  private boolean isWinCombMain(char ch) {
    for (int i = 0; i < row; i++) {
      if (array[i][i] != ch) {
        return false;
      }
    }
    return true;
  }

  private boolean isWinCombCol(char ch) {
    int score = 0;
    for (int i = 0; i < col; i++) {
      score = 0;
      for (int j = 0; j < row; j++) {
        if (array[j][i] != ch) {
          break;
        }
        score++;
      }
      if (score == col) {
        return true;
      }
    }
    return false;
  }

  private boolean isWinCombLine(char ch) {
    int score = 0;
    for (int i = 0; i < row; i++) {
      score = 0;
      for (int j = 0; j < col; j++) {
        if (array[i][j] != ch) {
          break;
        }
        score++;
      }
      if (score == col) {
        return true;
      }
    }
    return false;
  }
}
