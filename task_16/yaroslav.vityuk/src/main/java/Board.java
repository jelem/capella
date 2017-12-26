public class Board {

  public char[][] field = new char[3][3];

  public Board() {
    fill();
    print();
  }

  private void fill() {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        field[i][j] = '*';
      }
    }
  }

  public void print() {
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        System.out.print(field[i][j] + " ");
      }
      System.out.println();
    }
  }

  public boolean isFull() {
    for (char[] findChar : field) {
      for (char findCharHelper : findChar) {
        if (findCharHelper == '*') {
          return false;
        }
      }
    }
    System.out.println("There's no winner");
    return true;
  }

  public boolean oneWinner() {
    int checkX = 3 * 'X';
    int checkO = 3 * 'O';
    int firstDiagonal = 0;
    int secondDiagonal = 0;

    for (int i = 0; i < field.length; i++) {
      firstDiagonal += field[i][i];
      secondDiagonal += field[i][2 - i];
      int horizontal = 0;
      int vertical = 0;
      for (int j = 0; j < field.length; j++) {
        horizontal += field[i][j];
        vertical += field[j][i];
      }
      if (horizontal == checkO || horizontal == checkX || vertical == checkO
          || vertical == checkX) {
        return true;
      }
    }
    return firstDiagonal == checkO || firstDiagonal == checkX || secondDiagonal == checkO
        || secondDiagonal == checkX;
  }

}
