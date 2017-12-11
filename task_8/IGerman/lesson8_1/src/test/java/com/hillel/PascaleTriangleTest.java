package com.hillel;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PascaleTriangleTest {

    private static final int[][] ARRAYTEST3 = {{1}, {1, 1}, {1, 2, 1}};


    public static int sum(int[][] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
        }
        return sum;
    }

    public static void print(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void shouldBuildPascaleTriangle() {

        int[][] ar = PascaleTriangle.triangleBuild(2);
        int result = PascaleTriangleTest.sum(ar);

        assertEquals(3, result);
    }

    @Test
    public void shouldBuildPascaleTriangle2() {

        int[][] ar = PascaleTriangle.triangleBuild(4);
        int result = PascaleTriangleTest.sum(ar);

        assertEquals(15, result);
    }

    @Test
    public void shouldBuildPascaleTriangle3() {

        int[][] ar = PascaleTriangle.triangleBuild(1);
        int result = PascaleTriangleTest.sum(ar);

        assertEquals(1, result);
    }

    @Test
    public void shouldBuildPascaleTriangle4() {

        int[][] ar = PascaleTriangle.triangleBuild(3);
    /*

    PascaleTriangleTest.print(ARRAYTEST3);
    PascaleTriangleTest.print(ar);
*/
        assertArrayEquals("Arrays are not equal", ar, ARRAYTEST3);
    }

    @Test
    public void shouldBuildPascaleTriangle5() {

        int[][] ar = PascaleTriangle.triangleBuild(5);
        PascaleTriangleTest.print(ar);
    }
}
