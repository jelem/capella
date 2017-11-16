import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Andrew on 16.11.2017.
 */
public class Exercise {

  public static void main(String[] args) {
    System.out.println(sumOfDigits(8465187));
  }

  public static int sumOfDigits(int number) {
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number = number / 10;
    }
    return sum;
  }

  public static int factorial(int number) {
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

  public static int triangleCalculation(int side, String formula) {
    int result = 0;
    switch (formula) {
      case "perimeter":
        result = 4 * side;
        break;
      case "square":
        result = side * side;
        break;
      default:
        break;
    }
    return result;
  }

}
