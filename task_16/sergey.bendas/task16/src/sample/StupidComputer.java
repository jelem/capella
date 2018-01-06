package sample;

public class StupidComputer extends Player {


  public StupidComputer(String symbol) {
    super(symbol);
  }

  @Override
  public void makeMove(Board board) {
    while (true) {
      int firstCoord = (int) (Math.random() * 3);
      int secondCoord = (int) (Math.random() * 3);
      if (board.isFree(firstCoord, secondCoord)) {
        board.getButtons()[firstCoord][secondCoord].fire();
        return;
      }
    }
  }
}