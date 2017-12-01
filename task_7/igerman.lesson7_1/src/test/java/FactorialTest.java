import static junit.framework.TestCase.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

  @Test
  public void shouldCountFactorial() {

    int result = Factorial.factorial(5);

    assertEquals(120, result);

  }

  @Test
  public void shouldCountFactorial2() {

    int result = Factorial.factorial(1);

    assertEquals(1, result);

  }

  @Test
  public void shouldCountFactorial3() {

    int result = Factorial.factorial(0);

    assertEquals(1, result);

  }
}
