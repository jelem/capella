import static org.junit.Assert.*;

public class WrapperForTriangleTest {

  @org.junit.Test
  public void triangleCalculation() throws Exception {
    WrapperForTriangle wrapperForTriangle = new WrapperForTriangle();
    //1
    int actual = wrapperForTriangle.triangleCalculation(1,"test");
    int expected = 0;
    assertEquals(actual,expected);
    //2
    actual = wrapperForTriangle.triangleCalculation(10,"perimeter");
    expected = 40;
    assertEquals(actual,expected);
    //3
    actual = wrapperForTriangle.triangleCalculation(10,"square");
    expected = 100;
    assertEquals(actual,expected);
  }

}