import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class SquareTest {

  @Test
  public void shouldCountSquare() {

    int result = Square.squareCalculation(20, "square");

    assertEquals(400, result);
  }

  @Test
  public void shouldCountSquare2() {

    int result = Square.squareCalculation(20, "perimeter");

    assertEquals(80, result);
  }

  @Test
  public void shouldCountSquare3() {

    int result = Square.squareCalculation(20, "summa");

    assertEquals(0, result);
  }
}
