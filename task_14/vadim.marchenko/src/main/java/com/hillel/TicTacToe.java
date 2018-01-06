package com.hillel;

import java.util.Scanner;

public class TicTacToe {

  static char[][] field = new char[3][3];
  static char currentPlayer = 'X';

  public static void main(String[] args) {

    fillBoard(field);

    while (!gameFinished()) {
      String coords;
      do {
        printBoard();
        coords = inputCoordinates();
      }
      while (!validateCoordinates(coords));
      makeMove(field, coords, currentPlayer);
      currentPlayer = switchCurrentPlayer(currentPlayer);
    }

    calculateWinner();
  }

  private static void calculateWinner() {
    if (isDraw()) {
      System.out.println("Ничья !");
      return;
    }
    char player = currentPlayer == 'O' ? 'X' : 'O';
    System.out.println("Игрок " + player + " победил !");
    printBoard();
  }

  private static void printBoard() {
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.print(" |" + field[x][y] + "|");
      }
      System.out.println();
    }
  }

  private static boolean gameFinished() {
    return isPlayerWon() || isDraw();
  }

  private static boolean isDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (field[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean isPlayerWon() {
    char player = currentPlayer == 'O' ? 'X' : 'O';
    if (field[0][0] == player
        && field[0][1] == player
        && field[0][2] == player) {
      return true;
    }
    if (field[1][0] == player
        && field[1][1] == player
        && field[1][2] == player) {
      return true;
    }
    if (field[2][0] == player
        && field[2][1] == player
        && field[2][2] == player) {
      return true;
    }
    if (field[0][0] == player
        && field[1][0] == player
        && field[2][0] == player) {
      return true;
    }
    if (field[0][1] == player
        && field[1][1] == player
        && field[2][1] == player) {
      return true;
    }
    if (field[0][2] == player
        && field[1][2] == player
        && field[2][2] == player) {
      return true;
    }
    if (field[0][0] == player
        && field[1][1] == player
        && field[2][2] == player) {
      return true;
    }
    if (field[0][2] == player
        && field[1][1] == player
        && field[2][0] == player) {
      return true;
    }
    return false;
  }

  private static char switchCurrentPlayer(char currentPlayer) {
    if (currentPlayer == 'X') {
      return 'O';
    }
    return 'X';
  }

  private static void makeMove(char[][] field, String coords, char currentPlayer) {
    String[] parsedCoordinates = coords.split(" ");
    int firstNumber = Integer.valueOf(parsedCoordinates[0]);
    int secondNumber = Integer.valueOf(parsedCoordinates[1]);

    field[firstNumber][secondNumber] = currentPlayer;
  }

  private static boolean validateCoordinates(String coords) {
    if (coords.length() != 3) {
      return false;
    }
    String[] parsedCoordinates = coords.split(" ");
    int firstNumber = Integer.valueOf(parsedCoordinates[0]);
    int secondNumber = Integer.valueOf(parsedCoordinates[1]);
    if (firstNumber < 0 || firstNumber > 2 || secondNumber < 0 || secondNumber > 2) {
      return false;
    }
    if (field[firstNumber][secondNumber] != ' ') {
      return false;
    }
    return true;
  }

  private static String inputCoordinates() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите желаемые координаты: ");
    String userInput = scanner.nextLine();
    return userInput;
  }

  private static void fillBoard(char[][] field) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        field[i][j] = ' ';
      }
    }
  }

}
