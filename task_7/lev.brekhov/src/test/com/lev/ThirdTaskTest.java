package com.lev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThirdTaskTest {

    @Test
    public void shouldFindSquere() {
        int perimeter = ThirdTask.squareCalculation(4, "Squere is: ");

        assertEquals(16 ,perimeter);
    }

    @Test
    public void shouldFindPerimeter() {
        int square = ThirdTask.perimeterCalculation(12, "Perimeter is: ");

        assertEquals(144, square);
    }
}
