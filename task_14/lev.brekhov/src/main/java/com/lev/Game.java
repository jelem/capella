package com.lev;

public class Game {

  public static final char X = 'X';
  private Board board;
  private Player player1;
  private Player player2;

  private Player currentPlayer;

  public Game(Player player1, Player player2) {
    board = new Board();

    this.player1 = player1;
    this.player2 = player2;

    setCurrentPlayer();
  }

  private void setCurrentPlayer() {
    if (player1.getSymbol() == X) {
      currentPlayer = player1;
    } else {
      currentPlayer = player2;
    }
  }

  public String play() {

    while (!gameFinished()) {
      makeMove(board);
      changePlayer();
      board.print();
    }
    return gameResult();
  }

  private boolean gameFinished() {
    return board.isWin()
        || board.isFilled();
  }

  public void makeMove(Board board) {
    currentPlayer.makeMove(board);
  }

  private void changePlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  private String gameResult() {
    changePlayer();

    if (board.isWin()) {
      return "Easy game for " + currentPlayer.getName();
    }
    if (board.isFilled()) {
      return "No one is wins";
    } else {
      return "In order";
    }
  }
}