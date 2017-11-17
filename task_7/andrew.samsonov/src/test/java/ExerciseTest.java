import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExerciseTest {

  @Test
  public void shouldSummarizeDataSet1() {
    int result = Exercise.sumOfDigits(123543);
    assertEquals(18, result);
  }

  @Test
  public void shouldSummarizeDataSet2() {
    int result = Exercise.sumOfDigits(65812348);
    assertEquals(37, result);
  }

  @Test
  public void shouldSummarizeDataSet3() {
    int result = Exercise.sumOfDigits(8465187);
    assertEquals(39, result);
  }

  @Test
  public void shouldCountFactorialDataSet1() {
    int result = Exercise.factorial(5);
    assertEquals(120, result);
  }

  @Test
  public void shouldCountFactorialDataSet2() {
    int result = Exercise.factorial(7);
    assertEquals(5040, result);
  }

  @Test
  public void shouldCountFactorialDataSet3() {
    int result = Exercise.factorial(9);
    assertEquals(362880, result);
  }

  @Test
  public void tripleResultTestDataSet1() {
    int resultZero = Exercise.triangleCalculation(5, "zero");
    assertEquals(0, resultZero);
  }

  @Test
  public void tripleResultTestDataSet2() {
    int resultPerimeter = Exercise.triangleCalculation(5, "perimeter");
    assertEquals(20, resultPerimeter);
  }

  @Test
  public void tripleResultTestDataSet3() {
    int resultSquare = Exercise.triangleCalculation(5, "square");
    assertEquals(25, resultSquare);
  }

}
