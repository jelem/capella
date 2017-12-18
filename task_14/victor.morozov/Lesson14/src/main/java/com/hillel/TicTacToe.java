package com.hillel;

import java.util.Scanner;

public class TicTacToe {

  static final String COLUMN_NUM = "   1   2   3 ";
  static final String LINE = "  " + (char)45 + (char)45 + (char)45 + " " + (char)45 + (char)45 + (char)45 + " " + (char)45 + (char)45 + (char)45;

  public static void main(String[] args) {

    char[][] field = new char[3][3];
    char currentPlayer = 'X';
    int step = 0;
    fillboard(field);
    while(!gameFinished(field)) {
      String coords;
      do {
        coords = inputCoords(currentPlayer);
      } while (!validateCoords(coords));
      if (makeMove(field, coords, currentPlayer)) {
        currentPlayer = switchCurrentPlayer(currentPlayer);
        step++;
        if (step >= 9) {
          currentPlayer = ' ';
          break;
        }
      }
    }
    calculateWinner(currentPlayer);
  }

  private static void printField(char[][] field) {
    String str = "";
    System.out.println(COLUMN_NUM);
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++) {
        if (j == 0) {
          str = "" + (i+1) + (char)124 + " ";
        }
        str = str + "" + field[i][j] + " " + (char)124 + " ";
      }
      System.out.println(str);
      System.out.println(LINE);
    }
  }

  private static void calculateWinner(char currentPlayer) {
    if (currentPlayer == ' ') {
      System.out.println("Игра окончена. Ничья. ");
    } else {
      System.out.println("Игра окончена. Победил игрок " + switchCurrentPlayer(currentPlayer));
    }
  }

  private static char switchCurrentPlayer(char currentPlayer) {
    if (currentPlayer == 'X') {
      return '0';
    } else {
      return 'X';
    }
  }

  private static boolean makeMove(char[][] field, String coords, char currentPlayer) {
    int coordX = coords.charAt(0) - '0' - 1;
    int coordY = coords.charAt(1) - '0' - 1;
    if (field[coordX][coordY] == ' ') {
      field[coordX][coordY] = currentPlayer;
    } else {
      return false;
    }
    printField(field);
    return true;
  }

  private static boolean validateCoords(String coords) {
    if (coords.length() > 2) {
      return false;
    }
    if (coords.substring(0,1).equals("1") || coords.substring(0,1).equals("2") || coords.substring(0,1).equals("3")) {
      if (coords.substring(1,2).equals("1") || coords.substring(1,2).equals("2") || coords.substring(1,2).equals("3")) {
        return true;
      }
    }
    return false;
  }

  private static String inputCoords(char currentPlayer) {
    System.out.print("Ход игрока " + currentPlayer + ". Введите координаты: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private static boolean gameFinished(char[][] field) {
    if ((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') ||
        (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') ||
        (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') ||
        (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') ||
        (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') ||
        (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X') ||
        (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') ||
        (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X')) {
      return true;
    }

    if ((field[0][0] == '0' && field[0][1] == '0' && field[0][2] == '0') ||
        (field[1][0] == '0' && field[1][1] == '0' && field[1][2] == '0') ||
        (field[2][0] == '0' && field[2][1] == '0' && field[2][2] == '0') ||
        (field[0][0] == '0' && field[1][0] == '0' && field[2][0] == '0') ||
        (field[0][1] == '0' && field[1][1] == '0' && field[2][1] == '0') ||
        (field[0][2] == '0' && field[1][2] == '0' && field[2][2] == '0') ||
        (field[0][0] == '0' && field[1][1] == '0' && field[2][2] == '0') ||
        (field[0][2] == '0' && field[1][1] == '0' && field[2][0] == '0')) {
      return true;
    }
    return false;
  }

  private static void fillboard(char[][] field) {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field[i].length; j++) {
        field[i][j] = ' ';
      }
    }
    printField(field);
  }

}
