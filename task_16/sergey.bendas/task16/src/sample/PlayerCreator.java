package sample;

public class PlayerCreator {

  private static final String EASY = "Computer Easy";
  private static final String HARD = "Computer Hard";

  public static Player createPlayer(String value, String symbol) {
    if (value.equals(EASY)) {
      return new StupidComputer(symbol);
    }
    if (value.equals(HARD)) {
      return new HardComputer(symbol);
    } else {
      return new Human(symbol);
    }
  }
}
