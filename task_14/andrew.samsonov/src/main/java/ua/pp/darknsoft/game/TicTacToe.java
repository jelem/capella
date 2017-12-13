package ua.pp.darknsoft.game;

public class TicTacToe {

  private static char[][] field = new char[3][3];
  private static char currentPlayer = 'X';
  private static int scoreX = 0;
  private static int scoreO = 0;

  public static char getCurrentPlayer() {
    return TicTacToe.currentPlayer;
  }

  public static int getScoreX() {
    return TicTacToe.scoreX;
  }

  public static int getScoreO() {
    return TicTacToe.scoreO;
  }

  public static void setScore() {
    if (getCurrentPlayer() == 'X') {
      TicTacToe.scoreX++;
    } else {
      TicTacToe.scoreO++;
    }
  }

  public static void setCurrentPlayer(char curPlayer) {
    TicTacToe.currentPlayer = curPlayer;
  }

  public static void switchCurrentPlayer(char curPlayer) {
    if (curPlayer == 'X') {
      setCurrentPlayer('O');
    } else {
      setCurrentPlayer('X');
    }
  }

  public static void makeMove(int[] coords, char currentPlayer) {
    TicTacToe.field[coords[0]][coords[1]] = currentPlayer;
  }

  public static boolean validateCoordinates(int[] coords) {
    if (TicTacToe.field[coords[0]][coords[1]] == '\u0000') {
      return true;
    } else {
      return false;
    }

  }

  public static boolean calculateWinner() {
    int horizon = 0;
    int vertical = 0;
    int leftDiagonal = 0;
    int rightDiagonal = 0;

    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j <= 2; j++) {
        if (j > 0 && field[i][j] != '\u0000' && field[i][j] == field[i][j - 1]) {
          horizon++;
        }
        if (horizon == 2) {
          return true;
        }
        if (i > 0 && field[i][j] != '\u0000' && field[i][j] == field[i - 1][j]) {
          vertical++;
        }
        if (vertical == 3) {
          return true;
        }
        if (i > 0 && i == j && field[i][j] != '\u0000' && field[i][j] == field[i
            - 1][j - 1]) {
          leftDiagonal++;
        }
        if (leftDiagonal == 2) {
          return true;
        }
        if (i > 0 && j < 2 && field[i][j] != '\u0000' && field[i][j] == field[i
            - 1][j + 1]) {
          rightDiagonal++;
        }
        if (rightDiagonal == 3) {
          return true;
        }
      }

      horizon = 0;
    }
    return false;
  }

  public static void newGame() {
    char[][] chars = new char[][]{
        {'\u0000', '\u0000', '\u0000'},
        {'\u0000', '\u0000', '\u0000'},
        {'\u0000', '\u0000', '\u0000'}
    };
    TicTacToe.field = chars;
  }

  private static void fillBoard(char[][] otherField) {
    TicTacToe.field = otherField;
  }
}
