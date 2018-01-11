package com.lev;

import java.util.Random;

public class AIHard extends Player {

  private String name;
  private char symbol;
  private int moves;

  public AIHard(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public void makeMove(Board board) {
    char playerSymbol = 'X';
    if (symbol == 'X') {
      playerSymbol = 'O';
    }
    int min = 1;
    int max = 3;
    Random random = new Random();

    System.out.print("Now, " + this.name + " is moving:");
    boolean isFilled = false;
    int oxAxis = 0;
    int oyAxis = 0;
//    Human human = new Human(getName(), getSymbol());
    char[][] field = Board.getField();

    while (!isFilled) {
      for (int i = 0; i < field.length; i++) {
        if (field[i][i] == playerSymbol) {
          moves++;
        }
      }
      if (moves == 2) {
        for (int i = 0; i < field.length; i++) {
          if (field[i][i] == ' ') {
            oxAxis = i;
            oyAxis = i;
            i = field.length;
          }
        }
      }
      moves = 0;

      for (int i = field.length - 1; i >= 0; i--) {
        if (field[field.length - i - 1][i] == playerSymbol) {
          moves++;
        }
      }
      if (moves == 2) {
        for (int i = field.length - 1; i >= 0; i--) {
          if (field[field.length - i - 1][i] == ' ') {
            oxAxis = field.length - i - 1;
            oyAxis = i;
            i = -1;
          }
        }
      }
      moves = 0;

      for (int i = 0; i < field.length; i++) {
        for (int j = 0; j < field.length; j++) {
          if (field[i][j] == playerSymbol) {
          moves++;
        }
      }
      if (moves == 2) {
        for (int j = 0; j < field.length; j++) {
          if (field[i][j] == ' ') {
            oxAxis = i;
            oyAxis = j;
            j = field.length;
            }
          }
        }
      }
      moves = 0;

      for (int i = 0; i < field.length; i++) {
        for (char[] aField : field) {
          if (aField[i] == playerSymbol) {
            moves++;
          }
        }
        if (moves == 2) {
          for (int j = 0; j < field.length; j++) {
            if (field[j][i] == ' ') {
              oxAxis = i;
              oyAxis = j;
              j = field.length;
            }
          }
        }
      }
      moves = 0;

      if (moves != 2) {
        oxAxis = random.nextInt(max - min + 1) + min;
        oyAxis = random.nextInt(max - min + 1) + min;
      }
      isFilled = board.fillCell(oxAxis, oyAxis, this.symbol);
      System.out.println();
    }
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return symbol;
  }
}
