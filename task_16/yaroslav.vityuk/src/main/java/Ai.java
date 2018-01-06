import java.util.Random;

public class Ai extends Player {

  public Ai(String name, char symbol) {
    super(name, symbol);
  }

  public boolean makeMove(char[][] array) {
    int[] coordinates = inputCoordinates();
    int row = coordinates[0];
    int column = coordinates[1];

    if (validateCoordinates(coordinates, array)) {
      array[row][column] = getSymbol();
      return true;
    }
    return false;
  }

  private boolean validateCoordinates(int[] coordinatesArray, char[][] array) {
    int row = coordinatesArray[0];
    int column = coordinatesArray[1];

    if (array[row][column] != '*') {
      System.out.println("This point is full, choose another");
      return false;
    }
    return true;
  }

  private int[] inputCoordinates() {
    int[] coordinatesArray = new int[2];
    Random random = new Random();
    coordinatesArray[0] = random.nextInt(3);
    coordinatesArray[1] = random.nextInt(3);
    return coordinatesArray;
  }

}
