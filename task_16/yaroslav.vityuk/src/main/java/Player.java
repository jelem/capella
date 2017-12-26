import java.util.Scanner;

public class Player {

  private String name;
  private char symbol;

  public Player(String name, char symbol) {
    this.name = name;
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public char getSymbol() {
    return symbol;
  }

  public boolean makeMove(char[][] array) {
    String coordinates = inputCoordinates();
    String[] coordinatesArray = coordinates.split("");
    int row = Integer.parseInt(coordinatesArray[0]);
    int column = Integer.parseInt(coordinatesArray[1]);

    if (validateCoordinates(coordinates, array)) {
      array[row][column] = getSymbol();
      return true;
    }
    return false;
  }

  private boolean validateCoordinates(String string, char[][] array) {
    String[] coordinatesArray = string.split("");
    int row = Integer.parseInt(coordinatesArray[0]);
    int column = Integer.parseInt(coordinatesArray[1]);

    if (array[row][column] != '*') {
      System.out.println("This point is full, choose another");
      return false;
    }
    return true;
  }

  private String inputCoordinates() {
    Scanner scanner = new Scanner(System.in, "UTF-8");
    return scanner.nextLine();
  }

}
