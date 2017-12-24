package com.dima;

import java.util.Scanner;

public class Game {
  public static final char DROW = ' ';
  public static final int HUMAN = 1;
  public static final int EASY = 2;
  public static final int MEDIUME = 3;

  private Board board;
  private Player player1;
  private Player player2;
  private Player current;
  private char result;

  public Game() {
    setUp();
  }

  public void setUp() {
    board = new Board();
    result = DROW;
  }

  public void start() {
    MessageBox.ouestion(Board.X);
    initialize(1, Board.X);
    MessageBox.ouestion(Board.O);
    initialize(2, Board.O);
    current = player1;
    setUp();
  }

  private void initialize(int step, char ch) {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    int answer = scanner.nextInt();
    while (!validSelect(answer)) {
      MessageBox.errorWho();
      answer = scanner.nextInt();
    }
    switch (answer) {
      case HUMAN:
        if (step == 1) {
          player1 = FabricPlayer.human(ch);
        } else {
          player2 = FabricPlayer.human(ch);
        }
        break;

      case EASY:
        if (step == 1) {
          player1 = FabricPlayer.easy(ch);
        } else {
          player2 = FabricPlayer.easy(ch);
        }
        break;

      case MEDIUME:
        if (step == 1) {
          player1 = FabricPlayer.middle(ch);
        } else {
          player2 = FabricPlayer.middle(ch);
        }
        break;

      default:
        break;
    }
  }

  private boolean validSelect(int answer) {
    return answer > 0 && answer < 4;
  }

  public void mainLoop() {
    while (!board.isFull()) {
      board.draw();
      current.makeMove(board);
      if (board.isWin(current.getThisChar())) {
        result = current.getThisChar();
        return;
      }
      swap();
    }
  }

  private void swap() {
    current = current == player1 ? player2 : player1;
  }

  public void over() {
    board.draw();
    MessageBox.congratulations(result);
  }
}
