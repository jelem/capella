import static com.hillel.PascalTriangle.arrayInput;
import static com.hillel.PascalTriangle.arrayPrint;

import com.hillel.SpiralArray;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework8 {

  public static void main(String[] args) {
    boolean exit = false;
    int number = 0;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println();
      System.out.println("1. Pascal Triangle");
      System.out.println("2. Spiral Array");
      System.out.println("3. Task#6 with IntStream");
      System.out.println("4. Exit");

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
        case 3:
          System.out.println("1. Выведите первые 5 элементов массива, у которого размер 10");
          IntStream.range(0, 10)
              .filter(element -> element < 5)
              .forEach(element -> System.out.print(element + " "));
          System.out.println();

          System.out.println("2. Создайте массив размером n, элементами которого будут числа от 1 до n");
         // System.out.println("3. Создайте массив размером n, элементами которого будут числа от n до 1");
          System.out.print("Input number = ");
          int n = scanner.nextInt();
          //System.out.println();
          IntStream.range(1, n + 1)
             .forEach(element -> System.out.print(element + " "));
          System.out.println();
          /*Stream.of(1, n + 1)
              .sorted(Comparator.naturalOrder())
              .forEach(System.out::print);
          System.out.println();*/

          System.out.println("4. Выведите элементы массива, которые делятся на 3 без остатка. Массив {1, .., 10}");
          IntStream.range(1, 11)
              .filter(element -> element % 3 == 0)
              .forEach(element -> System.out.print(element + " "));
          System.out.println();

          System.out.println("5. Выведите все четные элементы массива. Массив {1, .., 10}");
          IntStream.range(1, 11)
              .filter(element -> element % 2 == 0)
              .forEach(element -> System.out.print(element + " "));
          System.out.println();

          System.out.println("6. Найдите сумму элементов массива. Массив {1, .., 10}");
          int sum = IntStream.range(1, 11)
                            .sum();
          System.out.println("Сумма =" + sum);

          System.out.println("7. Найдите среднее арифметическое элементов массива. Массив {1, .., 10}");
          double average = IntStream.range(1, 11)
                                .average().getAsDouble();
          System.out.println("Среднее арифметическое =" + average);

          System.out.println("8. Определите сумму минимального и максимального элементов массива. Массив {1, .., 10}");
          IntSummaryStatistics stats = IntStream.of(2,1,3,4,5,6,10,8,9,7)
                                .summaryStatistics();

          System.out.println("Сумма min + max = " + (stats.getMin() + stats.getMax()));

          System.out.println("9. Определите произведение всех нечетных элементов массива. Массив {1, .., 10}");
          int MultiplyOdd = IntStream.range(1, 11)
              .filter(element -> element % 2 != 0)
              .reduce(1, (a, b) -> a * b);
          System.out.println("Результат = " + MultiplyOdd);

/*          System.out.println("10. Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение. Массив {1, .., 10}");
          System.out.print("Input number = ");
          number = scanner.nextInt();
          boolean result = IntStream.range(1, 11)
              .anyMatch(e -> e == number);
          if (result) {
            System.out.println("Значение " + number + " присутствует в наборе");
          } else {
            System.out.println("Значение " + number + " отсутствует в наборе");
          }*/
          break;
        default:
          exit = true;
      }
    } while (!exit);
  }
}
