package com.dima;

public class Game {
  private Player player1;
  private Player player2;
  private Player current;
  private Player next;
  private Board board;
  private String result = "";

  public Game() {
    board = new Board();
    player1 = new CpuSmart(Board.X);
    player2 = new Human(Board.O);
    current = player1;
    next = player2;
  }

  public void start() {
  }

  public void mainLoop() {
    while( true ) {
      board.draw();
      current.makeMove(board);
      if ( !doNextIteration() ) {
        break;
      }
      swap();
    }
  }

  private void swap() {
    Player tmp = current;
    current = next;
    next = tmp;
  }

  private boolean doNextIteration() {
     if ( board.isWin( current.getSignature() ) ) {
      result += "Congtatulations mister " + current.getSignature() + " you are the champion!!";
      return false;
     } else if ( board.isFill() ) {
       result += "...Drow...";
       return false;
     }

    return true;
  }

  public void over() {
    board.draw();
    Conversation.Message(result);
  }
}
