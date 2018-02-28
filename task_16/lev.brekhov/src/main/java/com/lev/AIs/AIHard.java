package com.lev.AIs;

import com.lev.entity.Board;
import com.lev.entity.Player;
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
    char enemySymbol = setSymbol(symbol);

    System.out.print("Now, " + this.name + " is moving:");
    boolean isFilled = false;
    char[][] field = board.getField();

    while (!isFilled) {

      Coordinates move = gettingCoordinates(enemySymbol, field);

      isFilled = board.fillCell(move.oxAxis, move.oyAxis, symbol);
      System.out.println();
    }
  }

  private Coordinates gettingCoordinates(char symbol, char[][] field) {

    if (field[1][1] == ' ') {
      return new Coordinates(2, 2);
    }

    //main diagonal
    for (int i = 0; i < field.length; i++) {
      if (field[i][i] == symbol) {
        moves++;
      }
    }
    if (moves == 2) {
      for (int i = 0; i < field.length; i++) {
        if (field[i][i] == ' ') {
          moves = 0;
          return new Coordinates(i + 1, i + 1);
        }
      }
    } else {
      moves = 0;
    }

    //line
    for (int i = 0; i < field.length; i++) {
      for (char[] theField : field) {
        if (theField[i] == symbol) {
          moves++;
        }
      }
      if (moves == 2) {
        for (int j = 0; j < field.length; j++) {
          if (field[j][i] == ' ') {
            moves = 0;
            return new Coordinates(++j, ++i);
          }
        }
      } else {
        moves = 0;
      }
    }

    //column
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        if (field[i][j] == symbol) {
          moves++;
        }
      }
      if (moves == 2) {
        for (int j = 0; j < field.length; j++) {
          if (field[i][j] == ' ') {
            moves = 0;
            return new Coordinates(++i, ++j);
          }
        }
      } else {
        moves = 0;
      }
    }

    //revers diagonal
    for (int i = field.length - 1; i >= 0; i--) {
      if (field[field.length - i - 1][i] == symbol) {
        moves++;
      }
    }
    if (moves == 2) {
      for (int i = field.length - 1; i >= 0; i--) {
        if (field[field.length - i - 1][i] == ' ') {
          moves = 0;
          return new Coordinates(field.length - i, ++i);
        }
      }
    } else {
      moves = 0;
    }

    int max = 3;
    int min = 1;
    int oxAxis = randomMove(max, min);
    int oyAxis = randomMove(max, min);
    return new Coordinates(oxAxis, oyAxis);
  }

  public char setSymbol(char symbol) {
    if (symbol == 'O') {
      symbol = 'X';
    }
    return symbol;
  }


  class Coordinates {

    private int oxAxis;
    private int oyAxis;

    public Coordinates(int oxAxis, int oyAxis) {
      this.oxAxis = oxAxis;
      this.oyAxis = oyAxis;
    }

    public int getOxAxis() {
      return oxAxis;
    }

    public int getOyAxis() {
      return oyAxis;
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
