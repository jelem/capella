package com.hillel;

import java.util.Scanner;

public class TicTacToe {

  public static void main(String[] args) {

    char[][] table = new char[3][3];

    char currentPlayer = 'X';
    fillBoard(table);
    printTable(table);
    while (!gameFinished(table)) {
      System.out.println("Player " + currentPlayer + ", your turn");
      String coords;
      do {
        coords = inputCoords();
      } while (!validateCoords(table, coords));
      makeMove(table, currentPlayer, coords);
      printTable(table);
      currentPlayer = switchCurrentPlayer(currentPlayer);
    }
    calculateWinner(table, currentPlayer);
  }

  private static void printTable(char[][] table) {
    System.out.println("");
    System.out.println("    +---+---+---+");
    for (char[] aTable : table) {
      System.out.print("    | ");
      for (char anATable : aTable) {
        System.out.print(anATable + " | ");
      }
      System.out.println("");
      System.out.println("    +---+---+---+");
    }
    System.out.println("");

  }

  private static void calculateWinner(char[][] table, char currentPlayer) {
    if (isWinner(table)) {
      System.out.println("Player " + switchCurrentPlayer(currentPlayer) + " is winner!!!");
    } else {
      System.out.println("Draw");
    }
  }

  private static boolean gameFinished(char[][] table) {
    return boardIsFull(table) || isWinner(table);
  }

  private static boolean isWinner(char[][] table) {
    int leftDiag = 0;
    int rightDiag = 0;
    for (int i = 0; i < 3; i++) {
      int horisontalSum = 0;
      int verticalSum = 0;
      leftDiag += table[i][i];
      rightDiag += table[i][2 - i];
      for (int j = 0; j < 3; j++) {
        horisontalSum += table[i][j];
        verticalSum += table[j][i];
      }
      if (horisontalSum == 3 * 'X' || verticalSum == 3 * 'X' || horisontalSum == 3 * 'O'
          || verticalSum == 3 * 'O') {
        return true;
      }
    }
    if (leftDiag == 3 * 'X' || rightDiag == 3 * 'X' || leftDiag == 3 * 'O'
        || rightDiag == 3 * 'O') {
      return true;
    }
    return false;
  }

  private static boolean boardIsFull(char[][] table) {
    for (char[] aTable : table) {
      for (char anATable : aTable) {
        if (anATable == ' ') {
          return false;
        }
      }
    }
    return true;
  }

  private static void makeMove(char[][] table, char currentPlayer, String coords) {
    String[] coordsArray = coords.split("");
    int firstValue = Integer.parseInt(coordsArray[0]);
    int secondValue = Integer.parseInt(coordsArray[1]);
    table[firstValue - 1][secondValue - 1] = currentPlayer;
  }

  private static String inputCoords() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter coordinates");
    return scanner.nextLine();
  }

  private static boolean validateCoords(char[][] table, String coords) {
    String[] coordsArray = coords.split("");
    if (coordsArray.length != 2) {
      return false;
    }
    int firstValue = Integer.parseInt(coordsArray[0]);
    int secondValue = Integer.parseInt(coordsArray[1]);
    return firstValue <= 3 && firstValue > 0 && secondValue <= 3 && secondValue > 0
        && table[firstValue - 1][secondValue - 1] == ' ';
  }

  private static char switchCurrentPlayer(char currentPlayer) {
    return currentPlayer == 'X' ? 'O' : 'X';
  }

  private static void fillBoard(char[][] table) {
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = ' ';
      }
    }
  }

}
