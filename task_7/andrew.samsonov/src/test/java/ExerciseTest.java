import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Andrew on 16.11.2017.
 */
public class ExerciseTest {

  @Test
  public void sholdSumarize() {
    int result = Exercise.sumOfDigits(123543);
    assertEquals(18, result);
  }

  @Test
  public void sholdCountFactorial() {
    int result = Exercise.factorial(5);
    assertEquals(120, result);
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
