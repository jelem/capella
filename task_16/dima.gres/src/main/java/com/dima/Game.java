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
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    while (!validSelect(answer)) {
      MessageBox.errorWho();
      answer = scanner.nextInt();
    }
    switch (answer) {
      case HUMAN:
        if (step == 1) {
          player1 = FabricPlayer.Human(ch);
        } else {
          player2 = FabricPlayer.Human(ch);
        }
        break;

        case EASY:
          if (step == 1) {
            player1 = FabricPlayer.Easy(ch);
          } else {
            player2 = FabricPlayer.Easy(ch);
          }
        break;

        case MEDIUME:
          if (step == 1) {
            player1 = FabricPlayer.Middle(ch);
          } else {
            player2 = FabricPlayer.Middle(ch);
          }
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

  public void Over() {
    board.draw();
    MessageBox.congratulations(result);
  }
}
