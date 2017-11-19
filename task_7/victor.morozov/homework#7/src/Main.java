import java.util.Scanner;
import com.hillel.MathHillel;

public class Main {

  public static void main(String[] args) {
    boolean exit = false;
    int number = 0;
    long lnumber = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println();
      System.out.println("1. SumDigitsOfNumber");
      System.out.println("2. Factorial");
      System.out.println("3. PerimeterOfSquare");
      System.out.println("4. AreaOfSquare");
      System.out.println("5. Exit");

      System.out.print("Input variant: ");
      int variant = scanner.nextInt();

      switch (variant) {
        case 1:
          System.out.print("SumDigitsOfNumber: Input number = ");
          number = scanner.nextInt();
          System.out.println("SumDigitsOfNumber(" + number + ") = " + MathHillel.sumDigitsOfNumbers(number));
          break;
        case 2:
          System.out.print("Factorial: Input number(>0 and <=20) = ");
          lnumber = scanner.nextLong();
          if (lnumber > 20) {
            System.out.println("Error: number > 20");
          } else {
            long result = MathHillel.factorial(lnumber);
            if (result == -1) {
              System.out.println("Error: number <= 0");
            } else {
              System.out.println("Factorial(" + lnumber + ") = " + result);
            }
          }
          break;
        case 3:
          System.out.print("Perimeter of Square: Input side = ");
          number = scanner.nextInt();
          System.out.println("Perimeter of square = " + MathHillel.triangleCalculation(number, "perimeter"));
          break;
        case 4:
          System.out.print("Area of Square: Input side = ");
          number = scanner.nextInt();
          System.out.println("Area of square = " + MathHillel.triangleCalculation(number, "square"));
          break;
        default:
          exit = true;
      }
    } while (!exit);
  }

}
