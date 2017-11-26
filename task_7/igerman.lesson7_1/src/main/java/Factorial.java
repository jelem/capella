public class Factorial {

  public static int factorial(int number) {
    int fact = 1;      //т.к. факториал нуля равен единице
    for (int i = 1; i <= number; i++) {
      fact *= i;
    }
    return fact;
  }
}
