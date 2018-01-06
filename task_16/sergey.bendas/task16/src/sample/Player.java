package sample;

public abstract class Player {

  String symbol;

  public Player(String symbol) {
    this.symbol = symbol;
  }

  abstract void makeMove(Board board);

  public String getSymbol() {
    return this.symbol;
  }
}
