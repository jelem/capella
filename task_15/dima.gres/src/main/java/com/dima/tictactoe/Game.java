package com.dima.tictactoe;

public class Game {

  public static final char FIRST = 'X';
  public static final char SECOND = 'O';
  private static final boolean YES = true;
  private static final boolean NO = false;

  private Player player1 = new Player(FIRST);
  private Player player2 = new Player(SECOND);
  private Player current = player1;
  private Player winner = player1;
  private Board board = new Board();
  private OutInput outInput = new OutInput();


  public void mainLoop() {
    do {
      outInput.out(board, current);
      outInput.in(board, current);
      changeCurrent();
    }
    while ( goAhead() );
  }

  private void changeCurrent() {
    winner = current;
    current = current == player1 ? player2 : player1;
  }

  private boolean goAhead() {
    if ( board.isWinner(winner) ) {
      return NO;
    } else if ( board.isFilled() ) {
      winner = null;
      return NO;
    }
    return YES;
  }

  public void over() {
    outInput.outResult(winner);
  }

  public void start() {
    outInput.whatIsYourName("first");
    outInput.setNamePlayer(player1);
    outInput.whatIsYourName("second");
    outInput.setNamePlayer(player2);
  }
}
