package com.dima;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    char[][] field = new char[3][3];
    char currentPlayer = 'x';
    fillBoard(field);
    int[] coords = new int[2];

    while (!gameFinished(field)) {
      showField(field);
      do {
        inputCoordinates(coords, field);
      } while (!validateCoordinates(coords, field));
      makeMove(field, coords, currentPlayer);
      currentPlayer = switchCurrentPlayer(currentPlayer);
    }

    calculateWinner(field);
  }

  private static void calculateWinner(char[][] board) {
    if (isHasWon('x', board)) {
      System.out.println("Congratulations mister X! You've won the game!!");
    }else if(isHasWon('y', board)){
      System.out.println("Congratulations mister Y! You are the best player!");
    }else{
      System.out.println("...Draw...");
    }
  }

  private static char switchCurrentPlayer(char currentPlayer) {
    return  currentPlayer == 'x' ? 'y' : 'x';
  }

  public static void makeMove(char[][] field, int[] coords, char currentPlayer) {
    int row = coords[0];
    int col = coords[1];
    field[row][col] = currentPlayer;
  }

  public static boolean validateCoordinates(int[] coords, char[][] field) {
    int row = coords[0];
    int col = coords[1];
    if (row >= field.length || col >= field[0].length
            || field[row][col] != ' ') {
      return false;
    }
    return true;
  }


  public static void inputCoordinates(int[] coords, char[][] field) {
    System.out.println("Input coords(row coll): ");
    Scanner scanner = new Scanner(System.in);
    coords[0] = scanner.nextInt();
    coords[1] = scanner.nextInt();
  }


  public static boolean gameFinished(char[][] field) {
    if (!isFull(field) || isHasWon('x', field) || isHasWon('y',field)) {
      return true;
    }
    return false;
  }

  private static boolean isHasWon(char current, char[][] field) {
    if (isFillTheRows(current, field) || isFillTheCollumns(current, field) ||
            isFillTheMainDiagonal(current, field) || isFillSideDiagonal(current, field)) {
      return true;
    }
    return false;
  }

  private static boolean isFillSideDiagonal(char current, char[][] field) {
    int len = field.length;
    for (int i = 0; i < field.length; i++) {
      if (field[i][len - 1 - i] != current) {
        return false;
      }
    }
    return  true;
  }

  private static boolean isFillTheMainDiagonal(char current, char[][] field) {
    for (int i = 0; i < field.length; i++) {
      if (field[i][i] != current) {
        return false;
      }
    }
    return  true;
  }

  private static boolean isFillTheCollumns(char current, char[][] field) {
    for (int i = 0; i < field[0].length; i++) {
      if (isFillOneColl(current, i, field)) {
        return true;
      }
    }
    return false;
  }

  private static boolean isFillOneColl(char current, int col, char[][] chars) {
    for (int i = 0; i < chars.length; i++) {
      if (chars[i][col] != current) {
        return false;
      }
    }
    return true;
  }

  private static boolean isFillTheRows(char current, char[][] field) {
    for (int i = 0; i < field.length; i++) {
      if (isFillOneRow(current, field[i])) {
        return true;
      }
    }
    return false;
  }

  private static boolean isFillOneRow(char current, char[] chars) {
    for (int i = 0; i < chars.length; i++) {
      if (current != chars[i]) {
        return false;
      }
    }
    return true;
  }


  private static boolean isFull(char[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++){
        if (field[i][j] == ' ' ) {
          return true;
        }
      }
    }
    return false;
  }


  private static void showField(char[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++){
        if (field[i][j] != ' ') {
          System.out.print(" "+ field[i][j] + " ");
        }else {
          System.out.print(i + " " + j);
        }
        if (j >= 0 && j < 2) {
          System.out.print("|");
        }
      }
      if (i < 2) {
        System.out.println("\n___________");
      }
    }
    System.out.println();
  }

  public static void fillBoard(char[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++){
        field[i][j] = ' ';
      }
    }
  }

}
