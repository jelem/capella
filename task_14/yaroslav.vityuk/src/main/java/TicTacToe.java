import java.util.Scanner;

public class TicTacToe {

  private static char[][] field = new char[3][3];

  public static void main(String[] args) {

    char currentPlayer = 'X';
    fillBoard(field);
    while (!gameFinished()) {
      String coordinates;
      do {
        coordinates = inputCoordinates();
      }
      while (!validateCoordinates(coordinates, field));
      makeMove(field, coordinates, currentPlayer);
      currentPlayer = switchCurrentPlayer(currentPlayer);
      printField(field);
    }

    calculateWinner(currentPlayer);
  }

  private static boolean gameFinished() {
    return oneWinner(field) || fullField(field);
  }

  public static boolean oneWinner(char[][] array) {
    int checkX = 3 * 'X';
    int checkO = 3 * 'O';
    int firstDiagonal = 0;
    int secondDiagonal = 0;

    for (int i = 0; i < array.length; i++) {
      int horizontal = 0;
      int vertical = 0;
      firstDiagonal += array[i][i];
      secondDiagonal += array[i][2 - i];
      for (int j = 0; j < array.length; j++) {
        horizontal += array[i][j];
        vertical += array[j][i];
      }
      if (horizontal == checkX || horizontal == checkO || vertical == checkX
          || vertical == checkO) {
        return true;
      }
    }
    return firstDiagonal == checkX || firstDiagonal == checkO || secondDiagonal == checkX
        || secondDiagonal == checkO;
  }

  private static boolean fullField(char[][] array) {
    for (char[] fieldHelp : array) {
      for (char fieldHelpFind : fieldHelp) {
        if (fieldHelpFind == '*') {
          return false;
        }
      }
    }
    System.out.println("There's no winner");
    return true;
  }

  private static void calculateWinner(char player) {
    System.out.println("Winner is: " + switchCurrentPlayer(player));
  }

  private static char switchCurrentPlayer(char player) {
    return player == 'X' ? 'O' : 'X';
  }

  private static void makeMove(char[][] array, String string, char player) {
    String[] coordinatesArray = string.split("");
    int row = Integer.parseInt(coordinatesArray[0]);
    int column = Integer.parseInt(coordinatesArray[1]);

    array[row][column] = player;
  }

  private static void printField(char[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print("String " + i + ": ");
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static boolean validateCoordinates(String string, char[][] array) {
    String[] coordinatesArray = string.split("");
    int row = Integer.parseInt(coordinatesArray[0]);
    int column = Integer.parseInt(coordinatesArray[1]);

    if (array[row][column] != '*') {
      System.out.println("This point is full, choose another");
      return false;
    }
    return true;
  }

  private static String inputCoordinates() {
    System.out.println("Enter your move in format RowColumn, o.g. (11,00,12,01,12)");
    Scanner scanner = new Scanner(System.in, "UTF-8");
    return scanner.nextLine();
  }

  public static void fillBoard(char[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print("String " + i + ": ");
      for (int j = 0; j < array.length; j++) {
        array[i][j] = '*';
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}
