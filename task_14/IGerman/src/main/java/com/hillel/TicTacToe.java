package com.hillel;

import java.util.Scanner;

public class TicTacToe {

  private static char currentPlayer = 'x';

  public static void main(String[] args) {

    char[][] field = new char[3][3];
    // char currentPlayer = 'x';
    int cellCount = 0;
    System.out.println("currentPlayer = " + currentPlayer);
    fillBoard(field);

    while (!gameFinished(field)) {
      int[] coords;
      do {
        coords = inputCoordinates();
      }
      while (!validateCoordinates(coords));
      while (field[coords[0]][coords[1]] == '-') {
        makeMove(field, coords, currentPlayer);
        cellCount++;
        print(field);
        switchCurrentPlayer();
      }
    }

    calculateWinner(currentPlayer, cellCount);
  }


  public static int[] inputCoordinates() {
    System.out.println("Input your coordinates");
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

  public static void fillBoard(char[][] field) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        field[i][j] = '-';
      }
    }
  }

  public static Boolean gameFinished(char[][] field) {
    if ((field[0][0] == 'x' && field[0][1] == 'x' && field[0][2] == 'x')
        || (field[1][0] == 'x' && field[1][1] == 'x' && field[1][2] == 'x')
        || (field[2][0] == 'x' && field[2][1] == 'x' && field[2][2] == 'x')
        || (field[0][0] == 'x' && field[1][0] == 'x' && field[2][0] == 'x')
        || (field[0][1] == 'x' && field[1][1] == 'x' && field[2][1] == 'x')
        || (field[0][2] == 'x' && field[1][2] == 'x' && field[2][2] == 'x')
        || (field[0][0] == 'x' && field[1][1] == 'x' && field[2][2] == 'x')
        || (field[0][0] == 'o' && field[0][1] == 'o' && field[0][2] == 'o')
        || (field[1][0] == 'o' && field[1][1] == 'o' && field[1][2] == 'o')
        || (field[2][0] == 'o' && field[2][1] == 'o' && field[2][2] == 'o')
        || (field[0][0] == 'o' && field[1][0] == 'o' && field[2][0] == 'o')
        || (field[0][1] == 'o' && field[1][1] == 'o' && field[2][1] == 'o')
        || (field[0][2] == 'o' && field[1][2] == 'o' && field[2][2] == 'o')
        || (field[0][0] == 'o' && field[1][1] == 'o' && field[2][2] == 'o')) {
      return true;
    } else {
      return false;
    }
  }


  public static void makeMove(char[][] field, int[] coords, char currentPlayer) {

    field[coords[0]][coords[1]] = currentPlayer;
  }

  public static void switchCurrentPlayer() {
    if (currentPlayer == 'x') {
      currentPlayer = 'o';
    } else {
      currentPlayer = 'x';
    }
    System.out.println("Current player is " + currentPlayer);
  }

  public static void calculateWinner(char currentPlayer, int cellCount) {
    if (!isFilled(cellCount)) {
      if (currentPlayer == 'x') {
        System.out.println("Winner is O");
      } else {
        System.out.println("Winner is X");
      }
    } else {
      System.out.println("Ничья");
    }
  }

  public static void print(char[][] field) {
    for (int i = 0; i < 3; i++) {
      System.out.println(field[i][0] + " " + field[i][1] + " " + field[i][2]);
    }
  }

  public static boolean isFilled(int cellCount) {
    return (cellCount == 9);
  }
}
