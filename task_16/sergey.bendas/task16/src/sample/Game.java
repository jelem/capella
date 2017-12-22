package sample;

import javafx.scene.control.Button;

public class Game {

  private Player player1;
  private Player player2;
  private Board board;
  private Player currentPlayer;

  public Game(Button[][] buttons, Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
    this.board = new Board(buttons);
  }

  public void startGame() {
    currentPlayer = player1;
    board.enableButttons();
    currentPlayer.makeMove(board);
  }

  public void makeMove(int firstCoord, int secondCoord) {
    board.setMove(currentPlayer.getSymbol(), firstCoord, secondCoord);
    if (isFinished()) {
      finishGame();
      return;
    }
    changePlayer();
    currentPlayer.makeMove(board);
  }

  private void finishGame() {
    if (board.isWinningCombination()) {
      Printer.congratulateWinner(currentPlayer);
    } else {
      Printer.printDraw();
    }
    board.disableButttons();
  }

  private void changePlayer() {
    if (currentPlayer == player1) {
      currentPlayer = player2;
    } else {
      currentPlayer = player1;
    }
  }

  private boolean isFinished() {
    return board.isWinningCombination() || board.isFilled();
  }
}
