package ua.pp.darknsoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultidimensionalArrayTest {

  private static final int[][] PASCAL1 = {{1}};
  private static final int[][] PASCAL2 = {{1}, {1, 1}};
  private static final int[][] PASCAL3 = {{1}, {1, 1}, {1, 2, 1}};
  private static final int[][] PASCAL9 = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1},
      {1, 5, 10, 10, 5, 1},
      {1, 6, 15, 20, 15, 6, 1}, {1, 7, 21, 35, 35, 21, 7, 1}, {1, 8, 28, 56, 70, 56, 28, 8, 1}};
  private static final int[][] HELIX4x4 = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6},
      {10, 9, 8, 7}};

  @Test
  public void pasckalTriangleTest1() {
    int[][] autoPascal1 = MultidimensionalArray.pasckalTriangle(1);
    assertEquals("Loser", PASCAL1, autoPascal1);
  }

  @Test
  public void pasckalTriangleTest2() {
    int[][] autoPascal2 = MultidimensionalArray.pasckalTriangle(2);
    assertEquals("Loser", PASCAL2, autoPascal2);
  }

  @Test
  public void pasckalTriangleTest3() {
    int[][] autoPascal3 = MultidimensionalArray.pasckalTriangle(3);
    assertEquals("Loser", PASCAL3, autoPascal3);
  }

  @Test
  public void pasckalTriangleTest9() {
    int[][] autoPascal9 = MultidimensionalArray.pasckalTriangle(9);
    assertEquals("Loser", PASCAL9, autoPascal9);
  }

  @Test
  public void spiralTest() {
    int[][] autoHelix = MultidimensionalArray.spiral(8);
    assertEquals("Loser", HELIX4x4, autoHelix);
  }


}
