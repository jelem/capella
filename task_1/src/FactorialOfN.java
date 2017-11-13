public class FactorialOfN {

  public static void main(String... args) {
    int fact = 1;
    int number = Integer.parseInt(args[0]);

    for (int i = 1; i <= number; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }
}