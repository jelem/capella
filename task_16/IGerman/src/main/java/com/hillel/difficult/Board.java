package com.hillel.difficult;

public class Board {

  char[][] field = new char[3][3];

  public Board() {
    fillboard();
  }

  private void fillboard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        field[i][j] = '-';
      }
    }
  }

  boolean isFilled(int sellCount) {
    return (sellCount == 9);
  }

  boolean winnerCombination() {
    if ((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X')
        || (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X')
        || (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X')
        || (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X')
        || (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X')
        || (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X')
        || (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X')
        || (field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O')
        || (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O')
        || (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O')
        || (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O')
        || (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O')
        || (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O')
        || (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O')) {
      return true;
    } else {
      return false;
    }
  }

  void makeMove(int[] coords, Player currentPlayer) {
    field[coords[0]][coords[1]] = currentPlayer.getSymbol();
  }

  void print() {
    for (int i = 0; i < 3; i++) {
      System.out.println(field[i][0] + " " + field[i][1] + " " + field[i][2]);
    }
    System.out.println();
  }

  boolean isFree(int[] coords) {
    return (field[coords[0]][coords[1]] == '-');
  }
}
