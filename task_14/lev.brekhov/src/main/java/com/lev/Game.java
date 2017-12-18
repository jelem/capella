package com.lev;

import java.util.Scanner;

public class Game {

  public static final char X = 'X';
  public static final char O = 'O';
  private Board board;
  private Player player1;
  private Player player2;

  private Player currentPlayer;

  public Game(Player player1, Player player2) {
    board = new Board();

    board.print();
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
      makeMove();
      changePlayer();
      board.print();
    }

    return gameResult();
  }

  private boolean gameFinished() {
    return board.isWin()
        || board.isFilled();
  }

  private String gameResult() {
    changePlayer();

    if (board.isWin()) {
      return "Winner " + currentPlayer.getName();
    }
    if (board.isFilled()) {
      return "No one";
    } else {
      return "In order";
    }
  }

  private void changePlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  private void makeMove() {
    System.out.println("Makes move: " + currentPlayer.getName());
    Scanner sc = new Scanner(System.in);
    boolean isFilled = false;
    while (!isFilled) {
      System.out.println("Enter coords (x,y), where x,y can be 1-3: ");
      String[] arr = sc.next().split(",");
      int x = Integer.parseInt(arr[0]);
      int y = Integer.parseInt(arr[1]);
      isFilled = board.fillCell(x, y, currentPlayer.getSymbol());
    }
  }
}
