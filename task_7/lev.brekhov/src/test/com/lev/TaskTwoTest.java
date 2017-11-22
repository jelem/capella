package com.lev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTwoTest {

    @Test
    public void shouldCountFactorialOfFive() {
        int result = TaskTwo.factorial(5);

        assertEquals( 120, result);
    }

    @Test
    public void shouldCountFactorialOfTwelve() {
        int result = TaskTwo.factorial(12);

        assertEquals( 479001600, result);
    }
}
