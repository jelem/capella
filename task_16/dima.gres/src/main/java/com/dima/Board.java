package com.dima;

import java.util.NoSuchElementException;

public class Board {
  public static final int CLASSIC = 3;
  public static final char X = 'X';
  public static final char O = 'O';
  private int size;
  private int len;
  private char[][] field;
  private int row;
  private int col;

  public char[][] getField() {
    return field;
  }

  public int getLen() {
    return len;
  }

  public Board() {
    size = CLASSIC;
    len = size * size;
    field = new char[3][3];
    intialize();
  }

  private void intialize() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        field[i][j] = ' ';
      }
    }
  }

  public void draw() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j > 0 && j < size) {
          System.out.print("|");
        }
        if (field[i][j] != ' ') {
          System.out.print(" " + field[i][j] + " ");
        } else {
          System.out.print(" " + (i * 3 + j) + " ");
        }
      }
      if (i < size - 1) {
        System.out.println("\n___________");
      }
    }
    System.out.println("\n");
  }

  public static void copy(Board to, Board from, int len) {
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        to.getField()[i][j] = from.getField()[i][j];
      }
    }
  }

  public boolean isFull() {
    return  len == 0;
  }

  public boolean isWin(char ch) {
    return oneOfRows(ch) || oneOfCols(ch) || mainDiag(ch) || otherDiag(ch);
  }

  public void setCell(char ch, int index) {
    if (!isValidCoord(index)) {
      return;
    }
    parseCoords(index);
    len--;
    field[row][col] = ch;
  }

  public boolean isValidCoord(int index) {
    return index >= 0 && index < size * size && thisCellIsEmpty(index);
  }

  private void parseCoords(int index) {
    row = index / size;
    col = index % size;
  }

  private boolean thisCellIsEmpty(int index) {
    parseCoords(index);
    return field[row][col] == ' ';
  }

  private boolean otherDiag(char ch) {
    for (int i = 0; i < size; i++) {
      if (field[i][size - 1 - i] != ch) {
        return false;
      }
    }
    return  true;
  }

  private boolean mainDiag(char ch) {
    for (int i = 0; i < size; i++) {
      if (field[i][i] != ch) {
        return false;
      }
    }
    return  true;
  }

  private boolean oneOfCols(char ch) {
    for (int i = 0; i < size; i++) {
      if (thisCol(ch, i)) {
        return true;
      }
    }
    return  false;
  }

  private boolean thisCol(char ch, int id) {
    for (int i = 0; i < size; i++) {
      if (field[i][id] != ch) {
        return false;
      }
    }
    return true;
  }

  private boolean oneOfRows(char ch) {
    for (int i = 0; i < size; i++) {
      if (thisRow(ch, i)) {
        return true;
      }
    }
    return false;
  }

  private boolean thisRow(char ch, int id) {
    for (int i = 0; i < size; i++) {
     if (field[id][i] != ch) {
       return false;
     }
    }
    return true;
  }
}
