package com.hillel.tictactoe;

import java.util.Scanner;

public class Game {

  private static final char X = 'X';

  private Board board;
  private Player player1;
  private Player player2;
  static int cellCount = 0;


  private Player currentPlayer;

  public Game(Player player1, Player player2) {
    board = new Board();

    this.player1 = player1;
    this.player2 = player2;

    setCurrentPlayer();
  }

  public String play() {
    while (!gameFinished()) {
      makeMove();
      board.print();
    }
    return gameResult();
  }

  private String gameResult() {
    changePlayer();

    if (board.isWinningCombination()) {
      return "Победитель: " + currentPlayer.getName();
    }

    if (board.isFilled()) {
      return "Ничья";
    } else {
      return "Еще в процессе";
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
    int[] coords;
    do {
      coords = inputCoordinates();
    }
    while (!validateCoordinates(coords));

    while (board.isFree(coords)) {
      board.fillCell(coords[0], coords[1], currentPlayer.getSymbol());
      cellCount++;
      changePlayer();

    }

  }

  private boolean gameFinished() {
    return board.isFilled()
        || board.isWinningCombination();
  }

  private void setCurrentPlayer() {
    if (player1.getSymbol() == X) {
      currentPlayer = player1;
    } else {
      currentPlayer = player2;
    }
  }

  private int[] inputCoordinates() {
    System.out.println("Player " + currentPlayer.getSymbol() + " input your coordinates");
    Scanner scanner = new Scanner(System.in, "UTF-8");
    int[] coords = new int[2];
    if (scanner.hasNextLine()) {
      String ss = scanner.nextLine();
      coords[0] = Integer.parseInt(ss.substring(0, 1)) - 1;
      coords[1] = Integer.parseInt(ss.substring(1, 2)) - 1;
    }
    return coords;
  }

  public static boolean validateCoordinates(int[] coords) {

    if ((coords[0] < 3 && coords[0] >= 0) && (coords[1] < 3 && coords[1] >= 0)) {
      return true;
    } else {
      System.out.println("Your coordinates are not valid");
      return false;
    }
  }
}


