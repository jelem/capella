package com.lev;

import java.util.Random;

public class AIHard extends Player {

  private String name;
  private char symbol;
  private int moves;

  public AIHard(String name, char symbol) {
    super(name, symbol);
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

    System.out.print("Now, " + this.name + " is moving:");
    boolean isFilled = false;
    int oxAxis = 0;
    int oyAxis = 0;
    char[][] field = board.getField();

    while (!isFilled) {
      //main diagonal
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
      } else {
        moves = 0;
        oxAxis = randomMove(max, min);
        oyAxis = randomMove(max, min);
      }

      //columns
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
      }else {
        moves = 0;
        oxAxis = randomMove(max, min);
        oyAxis = randomMove(max, min);
      }

      //line
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
        }else {
          moves = 0;
          oxAxis = randomMove(max, min);
          oyAxis = randomMove(max, min);
        }
      }

      //column
      for (int i = 0; i < field.length; i++) {
        for (char[] theField : field) {
          if (theField[i] == playerSymbol) {
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
        } else {
          moves = 0;
          oxAxis = randomMove(max, min);
          oyAxis = randomMove(max, min);
        }

      }

      isFilled = board.fillCell(oxAxis, oyAxis, this.symbol);
      System.out.println();
    }
  }

  private int randomMove(int max, int min) {
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
  }

  public String getName() {
    return this.name;
  }

  public char getSymbol() {
    return symbol;
  }
}
