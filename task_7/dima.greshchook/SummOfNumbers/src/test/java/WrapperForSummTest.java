import static org.junit.Assert.*;

public class WrapperForSummTest {

  @org.junit.Test
  public void summ() throws Exception {
    WrapperForSumm wrapperForSumm = new WrapperForSumm();
    //1
    int actual = wrapperForSumm.summ(1);
    int expected = 1;
    assertEquals(actual,expected);
    //2
    actual = wrapperForSumm.summ(123);
    expected = 1 + 2 +3;
    assertEquals(actual,expected);
    //3
    actual = wrapperForSumm.summ(123543);
    expected = 18;
    assertEquals(actual,expected);
    //4
    actual = wrapperForSumm.summ(91005);
    expected = 15;
    assertEquals(actual,expected);
  }
}