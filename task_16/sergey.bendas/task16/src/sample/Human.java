package sample;

public class Human extends Player {

  public Human(String symbol) {
    super(symbol);
  }

  @Override
  public void makeMove(Board board) {
    Printer.printTurn(symbol);
  }
}