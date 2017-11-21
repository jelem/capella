import static com.hillel.PascalTriangle.arrayInput;
import static com.hillel.PascalTriangle.arrayPrint;

import com.hillel.SpiralArray;
import java.util.Scanner;

public class Homework8 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Input N: ");
      int n = scanner.nextInt();
/*      int[][] pascal = arrayInput(n);
      arrayPrint(pascal);*/

      int[][] array = SpiralArray.arrayInit(n);
      array = SpiralArray.fillArraySpiral(array, n);
      SpiralArray.arrayPrint(array);

  }

}
