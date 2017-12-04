package ua.pp.darknsoft;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MultidimensionalArrayTest {

  private static final int[][] PASCAL1 = {{1}};
  private static final int[][] PASCAL2 = {{1}, {1, 1}};
  private static final int[][] PASCAL3 = {{1}, {1, 1}, {1, 2, 1}};
  private static final int[][] PASCAL9 = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1},
      {1, 5, 10, 10, 5, 1},
      {1, 6, 15, 20, 15, 6, 1}, {1, 7, 21, 35, 35, 21, 7, 1}, {1, 8, 28, 56, 70, 56, 28, 8, 1}};

  private static final int[][] HELIX0x0 = {};
  private static final int[][] HELIX1x1 = {{1}};
  private static final int[][] HELIX3x3 = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
  private static final int[][] HELIX4x4 = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6},
      {10, 9, 8, 7}};
  private static final int[][] HELIX8x8 = {{1, 2, 3, 4, 5, 6, 7, 8},
      {28, 29, 30, 31, 32, 33, 34, 9},
      {27, 48, 49, 50, 51, 52, 35, 10}, {26, 47, 60, 61, 62, 53, 36, 11},
      {25, 46, 59, 64, 63, 54, 37, 12}, {24, 45, 58, 57, 56, 55, 38, 13},
      {23, 44, 43, 42, 41, 40, 39, 14}, {22, 21, 20, 19, 18, 17, 16, 15}};

  /* PASCAL'S TRIANGLE TEST*/
  @Test
  public void pascalTriangleTest1() {
    int[][] autoPascal = MultidimensionalArray.pascalTriangle(1);
    assertArrayEquals("Loser", PASCAL1, autoPascal);
  }

  @Test
  public void pascalTriangleTest2() {
    int[][] autoPascal = MultidimensionalArray.pascalTriangle(2);
    assertArrayEquals("Loser", PASCAL2, autoPascal);
  }

  @Test
  public void pascalTriangleTest3() {
    int[][] autoPascal = MultidimensionalArray.pascalTriangle(3);
    assertArrayEquals("Loser", PASCAL3, autoPascal);
  }

  @Test
  public void pascalTriangleTest33() {
    int[][] autoPascal = MultidimensionalArray.pascalTriangle(3);
    assertArrayEquals("Loser", PASCAL3, autoPascal);
  }

  @Test
  public void pascalTriangleTest9() {
    int[][] autoPascal = MultidimensionalArray.pascalTriangle(9);
    assertArrayEquals("Loser", PASCAL9, autoPascal);
  }

  /* HELIX TEST*/
  @Test
  public void spiralTest0() {
    int[][] autoHelix = MultidimensionalArray.helixInit(0);
    assertArrayEquals("Loser", HELIX0x0, autoHelix);
  }

  @Test
  public void spiralTest1() {
    int[][] autoHelix = MultidimensionalArray.helixInit(1);
    assertArrayEquals("Loser", HELIX1x1, autoHelix);
  }

  @Test
  public void spiralTest3() {
    int[][] autoHelix = MultidimensionalArray.helixInit(3);
    assertArrayEquals("Loser", HELIX3x3, autoHelix);
  }

  @Test
  public void spiralTest4() {
    int[][] autoHelix = MultidimensionalArray.helixInit(4);
    assertArrayEquals("Loser", HELIX4x4, autoHelix);
  }

  @Test
  public void spiralTest8() {
    int[][] autoHelix = MultidimensionalArray.helixInit(8);
    assertArrayEquals("Loser", HELIX8x8, autoHelix);
  }


}
