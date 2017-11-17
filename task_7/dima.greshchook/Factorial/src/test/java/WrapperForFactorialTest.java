import static org.junit.Assert.*;

public class WrapperForFactorialTest {

  @org.junit.Test
  public void factorial() throws Exception {
    WrapperForFactorial wrapperForFactorial = new WrapperForFactorial();
    //1
    long actual = wrapperForFactorial.factorial(1);
    long expected = 1;
    assertEquals(actual,expected);
    //2
    actual = wrapperForFactorial.factorial(1);
    expected = 1;
    assertEquals(actual,expected);
    //3
    actual = wrapperForFactorial.factorial(5);
    expected = 120;
    assertEquals(actual,expected);
    //4
    actual = wrapperForFactorial.factorial(4);
    expected = 4 * 3 * 2;
    assertEquals(actual,expected);
  }

}