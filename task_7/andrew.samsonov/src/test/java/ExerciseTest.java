import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Andrew on 16.11.2017.
 */
public class ExerciseTest {

  @Test
  public void shouldSummarize() {
    int result1 = Exercise.sumOfDigits(123543);
    assertEquals(18, result1);
    int result2 = Exercise.sumOfDigits(65812348);
    assertEquals(37, result2);
    int result3 = Exercise.sumOfDigits(8465187);
    assertEquals(39, result3);
  }

  @Test
  public void shouldCountFactorial() {
    int result1 = Exercise.factorial(5);
    int result2 = Exercise.factorial(7);
    int result3 = Exercise.factorial(9);
    assertEquals(120, result1);
    assertEquals(5040, result2);
    assertEquals(362880, result3);
  }

  @Test
  public void tripleResultTest() {
    int resultZero = Exercise.triangleCalculation(5, "zero");
    int resultPerimeter = Exercise.triangleCalculation(5, "perimeter");
    int resultSquare = Exercise.triangleCalculation(5, "square");
    assertEquals(0, resultZero);
    assertEquals(20, resultPerimeter);
    assertEquals(25, resultSquare);
  }

}
