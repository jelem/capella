public class GameProcess {

  private static final char coordinateX = 'X';
  private Board board;
  private Player player1;
  private Player player2;
  private Player currentPlayer;


  public GameProcess(Player player1, Player player2) {
    board = new Board();
    this.player1 = player1;
    this.player2 = player2;
    setCurrentPlayer();
  }

  public void play() {
    while (!finish()) {
      if (currentPlayer.makeMove(board.field)) {
        currentPlayer = switchCurrentPlayer();
        board.print();
      }
    }
    result();
  }

  private void result() {
    if (board.isFull()) {
      return;
    }
    currentPlayer = switchCurrentPlayer();
    System.out.println("Winner is: " + currentPlayer.getName());
  }

  public Player switchCurrentPlayer() {
    return currentPlayer == player1 ? player2 : player1;
  }


  private void setCurrentPlayer() {
    if (player1.getSymbol() == coordinateX) {
      currentPlayer = player1;
    } else {
      currentPlayer = player2;
    }
  }

  private boolean finish() {
    return board.oneWinner() || board.isFull();
  }

}
