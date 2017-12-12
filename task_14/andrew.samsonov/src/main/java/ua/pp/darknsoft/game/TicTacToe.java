package ua.pp.darknsoft.game;

public class TicTacToe {

  private static char[][] field = new char[3][3];
  private static char currentPlayer = 'X';
  private static int scoreX = 0;
  private static int scoreO = 0;

  public static char[][] getField() {
    return field;
  }

  public static void setField(char[][] field) {
    TicTacToe.field = field;
  }

  public static char getCurrentPlayer() {
    return currentPlayer;
  }

  public static int getScoreX() {
    return scoreX;
  }

  public static int getScoreO() {
    return scoreO;
  }

  public static void setScore() {
    if (getCurrentPlayer() == 'X') {
      scoreX++;
    } else {
      scoreO++;
    }
  }

  public static void setCurrentPlayer(char currentPlayer) {
    TicTacToe.currentPlayer = currentPlayer;
  }

  public static void switchCurrentPlayer(char curPlayer) {
    if (curPlayer == 'X') {
      setCurrentPlayer('O');
    } else {
      setCurrentPlayer('X');
    }
  }

  public static void makeMove(int[] coords, char currentPlayer) {
    field[coords[0]][coords[1]] = currentPlayer;
  }

  public static boolean validateCoordinates(int[] coords) {
    if (field[coords[0]][coords[1]] == '\u0000') {
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
        if (j > 0 && getField()[i][j] != '\u0000' && getField()[i][j] == getField()[i][j - 1]) {
          horizon++;
        }
        if (horizon == 2) {
          return true;
        }
        if (i > 0 && getField()[i][j] != '\u0000' && getField()[i][j] == getField()[i - 1][j]) {
          vertical++;
        }
        if (vertical == 3) {
          return true;
        }
        if (i > 0 && i == j && getField()[i][j] != '\u0000' && getField()[i][j] == getField()[i
            - 1][j - 1]) {
          leftDiagonal++;
        }
        if (leftDiagonal == 2) {
          return true;
        }
        if (i > 0 && j < 2 && getField()[i][j] != '\u0000' && getField()[i][j] == getField()[i
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
    setField(chars);
  }

  private static void fillBoard(char[][] field) {
    setField(field);
  }
}
