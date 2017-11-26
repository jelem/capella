package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    @Test
    public void shouldBuildPascalTriangle() {

        int[][] pascalTriangleExpectedArray = {
                {1},
                {1, 1},
                {1, 2, 1},
                {1, 3, 3, 1},
                {1, 4, 6, 4, 1},
                {1, 5, 10, 10, 5, 1},
                {1, 6, 15, 20, 15, 6, 1}
        };

        int[][] pascalTriangleResultArray = PascalTriangle.build(7);

        assertEquals(pascalTriangleExpectedArray, pascalTriangleResultArray);
    }

    @Test
    public void shouldReturnNullPascalsTriangle() {

        int[][] pascalTriangleResultArray = PascalTriangle.build(-2);

        assertEquals(null, pascalTriangleResultArray);
    }
}
