import static com.hillel.PascalTriangle.arrayInput;
import static com.hillel.PascalTriangle.arrayPrint;

import com.hillel.SpiralArray;
import java.util.Scanner;

public class Homework8 {

  public static void main(String[] args) {
    boolean exit = false;
    int number = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println();
      System.out.println("1. Pascal Triangle");
      System.out.println("2. Spiral Array");
      System.out.println("3. Exit");

      System.out.print("Input variant: ");
      int variant = scanner.nextInt();

      switch (variant) {
        case 1:
          System.out.print("Pascal Triangle: Input number = ");
          number = scanner.nextInt();
          System.out.println();
          int[][] pascal = arrayInput(number);
          arrayPrint(pascal);
          break;
        case 2:
          System.out.print("Spiral Array: Input number = ");
          number = scanner.nextInt();
          System.out.println();
          int[][] array = SpiralArray.arrayInit(number);
          array = SpiralArray.fillArraySpiral(array, number);
          SpiralArray.arrayPrint(array);
          break;
        default:
          exit = true;
      }
    } while (!exit);
  }
}
