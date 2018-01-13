package sample;

public class HardComputer extends Player {

  private static final String XX_ = "XX ";
  private static final String OO_ = "OO ";
  private static final String X_X = "X X";
  private static final String O_O = "O O";
  private static final String _XX = " XX";
  private static final String _OO = " OO";

  public HardComputer(String symbol) {
    super(symbol);
  }

  @Override
  public void makeMove(Board board) {
    int[] coords = selectBestMove(board);
    board.getButtons()[coords[0]][coords[1]].fire();
  }

  private int[] selectBestMove(Board board) {
    if (board.valueAt(1, 1).equals(" ")) {
      return new int[]{1, 1};
    }
    if (horizontalMove(board) != null) {
      return horizontalMove(board);
    }
    if (verticalMove(board) != null) {
      return verticalMove(board);
    }
    if (leftDiagMove(board) != null) {
      return leftDiagMove(board);
    }
    if (rightDiagMove(board) != null) {
      return rightDiagMove(board);
    }
    return randomMove(board);
  }


  private int[] rightDiagMove(Board board) {
    String rightDiag = board.valueAt(0, 2) + board.valueAt(1, 1) + board.valueAt(2, 0);
    if (rightDiag.equals(XX_) || rightDiag.equals(OO_)) {
      return new int[]{2, 0};
    }
    if (rightDiag.equals(_OO) || rightDiag.equals(_OO)) {
      return new int[]{0, 2};
    }
    return null;
  }

  private int[] leftDiagMove(Board board) {
    String leftDiag = board.valueAt(0, 0) + board.valueAt(1, 1) + board.valueAt(2, 2);
    if (leftDiag.equals(XX_) || leftDiag.equals(OO_)) {
      return new int[]{2, 2};
    }
    if (leftDiag.equals(_XX) || leftDiag.equals(_OO)) {
      return new int[]{0, 0};
    }
    return null;
  }

  private int[] verticalMove(Board board) {
    for (int i = 0; i < 3; i++) {
      String vertical = board.valueAt(0, i) + board.valueAt(1, i) + board.valueAt(2, i);
      if (vertical.equals(XX_) || vertical.equals(OO_)) {
        return new int[]{2, i};
      }
      if (vertical.equals(X_X) || vertical.equals(O_O)) {
        return new int[]{1, i};
      }
      if (vertical.equals(_XX) || vertical.equals(_OO)) {
        return new int[]{0, i};
      }
    }
    return null;
  }

  private int[] horizontalMove(Board board) {
    for (int i = 0; i < 3; i++) {
      String horizontal = board.valueAt(i, 0) + board.valueAt(i, 1) + board.valueAt(i, 2);
      if (horizontal.equals(XX_) || horizontal.equals(OO_)) {
        return new int[]{i, 2};
      }
      if (horizontal.equals(X_X) || horizontal.equals(O_O)) {
        return new int[]{i, 1};
      }
      if (horizontal.equals(_XX) || horizontal.equals(_OO)) {
        return new int[]{i, 0};
      }
    }
    return null;
  }

  private int[] randomMove(Board board) {
    while (true) {
      int firstCoord = (int) (Math.random() * 3);
      int secondCoord = (int) (Math.random() * 3);
      if (board.isFree(firstCoord, secondCoord)) {
        return new int[]{firstCoord, secondCoord};
      }
    }
  }
}
