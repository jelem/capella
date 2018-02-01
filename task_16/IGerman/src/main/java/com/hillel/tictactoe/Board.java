package com.hillel.tictactoe;

public class Board {

  private char[][] board = new char[3][3];

  public Board() {
    fillboard();
  }

  private void fillboard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = '-';
      }
    }
  }

  boolean isFilled(int sellCount) {
    return (sellCount == 9);
  }

  boolean winnerCombination() {
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
        || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
        || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
        || (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
        || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
        || (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
        || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
        || (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
        || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
        || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
        || (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
        || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
        || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
        || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')) {
      return true;
    } else {
      return false;
    }
  }

  void makeMove(int[] coords, Player currentPlayer) {
    board[coords[0]][coords[1]] = currentPlayer.getSymbol();
  }

  void print() {
    for (int i = 0; i < 3; i++) {
      System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
    }
  }

  boolean isFree(int[] coords) {
    return (board[coords[0]][coords[1]] == '-');
  }
}
