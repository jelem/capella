package com.hillel.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Game {

  private static final char X = 'X';
  private Board board;
  private Player player1;
  private Player player2;
  int cellCount = 0;
  private Player currentPlayer;

  public Game(Player player1) {
    this.player1 = player1;
    this.player2 = new Player("Computer", 'O');
    board = new Board();
    currentPlayer = player1;
  }

  String play() {
    int[] coords;
    while (!gameFinished()) {
      do {
        coords = inputCoords(currentPlayer);
      }
      while (!validateCoords(coords));

      board.makeMove(coords, currentPlayer);
      cellCount++;
      board.print();
      changeCurrentPlayer();
    }
    return calculateWinner();
  }

  private boolean gameFinished() {
    return board.isFilled(cellCount) || board.winnerCombination();
  }

  private int[] inputCoords(Player currentPlayer) {
    if (currentPlayer.equals(player1)) {
      System.out.println("Player " + currentPlayer.getSymbol() + " input your coordinates");
      Scanner scanner = new Scanner(System.in, "UTF-8");
      int[] coords = new int[2];
      if (scanner.hasNextLine()) {
        String ss = scanner.nextLine();
        coords[0] = Integer.parseInt(ss.substring(0, 1)) - 1;
        coords[1] = Integer.parseInt(ss.substring(1, 2)) - 1;
      }
      return coords;
    } else {
      int[] coords = new int[2];
      do {
        coords[0] = new Random().nextInt(3);
        coords[1] = new Random().nextInt(3);
      }
      while (!board.isFree(coords));
      return coords;
    }
  }

  private boolean validateCoords(int[] coords) {
    if ((coords[0] < 3 && coords[0] >= 0)
        && (coords[1] < 3
        && coords[1] >= 0)
        && board.isFree(coords)) {
      return true;
    } else {
      System.out.println("Your coordinates are not valid");
      return false;
    }
  }

  private void changeCurrentPlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  String calculateWinner() {
    changeCurrentPlayer();

    if (board.winnerCombination()) {
      return "The winner is " + currentPlayer.getName();
    }
    if (board.isFilled(cellCount)) {
      return "Ничья";
    } else {
      return "Еще в процессе";
    }

  }
}

