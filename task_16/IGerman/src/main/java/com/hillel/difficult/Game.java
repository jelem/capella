package com.hillel.difficult;

import java.util.Random;
import java.util.Scanner;

public class Game {

  private static final char X = 'X';
  private Board board;
  private Player player1;
  private Player player2;
  int cellCount = 0;
  private Player currentPlayer;
  private boolean difficult;

  public Game(Player player1) {
    this.player1 = player1;
    this.player2 = new Player("Computer", 'O');
    board = new Board();
    currentPlayer = player1;
  }

  String play() {
    int[] coords;
    turnOnDifficulty();
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

  private void turnOnDifficulty() {
    System.out.println("If you want to change the \"difficulty\" enter number 1");
    Scanner scanner = new Scanner(System.in, "UTF-8");
    int dif = 0;
    if (scanner.hasNextLine()) {
      String ss = scanner.nextLine();
      dif = Integer.parseInt(ss);
    }
    if (dif == 1) {
      difficult = true;
    }
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
      if (difficult) {

        return setDificulty(board.field);
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

  private int[] setDificulty(char[][] field) {
    int[] coords = new int[2];
    do {

      if (field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 2;
      } else if (field[0][0] == 'X' && field[0][2] == 'X' && field[0][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 1;
      } else if (field[0][1] == 'X' && field[0][2] == 'X' && field[0][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 0;
      } else if (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 2;
      } else if (field[1][0] == 'X' && field[1][2] == 'X' && field[1][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 1;
      } else if (field[1][1] == 'X' && field[1][2] == 'X' && field[1][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 0;
      } else if (field[2][0] == 'X' && field[2][1] == 'X' && field[2][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 2;
      } else if (field[2][0] == 'X' && field[2][2] == 'X' && field[2][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 1;
      } else if (field[2][1] == 'X' && field[2][2] == 'X' && field[2][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 0;
      } else if (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 0;
      } else if (field[0][0] == 'X' && field[2][0] == 'X' && field[1][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 0;
      } else if (field[1][0] == 'X' && field[2][0] == 'X' && field[0][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 0;
      } else if (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 1;
      } else if (field[0][1] == 'X' && field[2][1] == 'X' && field[1][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 1;
      } else if (field[1][1] == 'X' && field[2][1] == 'X' && field[0][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 1;
      } else if (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 2;
      } else if (field[0][2] == 'X' && field[2][2] == 'X' && field[1][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 2;
      } else if (field[1][2] == 'X' && field[2][2] == 'X' && field[0][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 2;
      } else if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 2;
      } else if (field[0][0] == 'X' && field[2][2] == 'X' && field[1][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 1;
      } else if (field[1][1] == 'X' && field[2][2] == 'X' && field[0][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 0;
      } else if (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 2;
        coords[1] = 0;
      } else if (field[0][2] == 'X' && field[2][0] == 'X' && field[1][1] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 1;
        coords[1] = 1;
      } else if (field[1][1] == 'X' && field[2][0] == 'X' && field[0][2] == '-'
          && currentPlayer.getSymbol() == 'O') {
        coords[0] = 0;
        coords[1] = 2;
      } else {
        coords[0] = new Random().nextInt(3);
        coords[1] = new Random().nextInt(3);
      }
    }
    while (!board.isFree(coords));
    return coords;
  }
}

