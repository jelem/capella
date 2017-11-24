package com.lev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTaskTest {

    @Test
    public void shouldSumOfNumElements() {
        int result = FirstTask.function(123543);

        assertEquals(17, result);
    }

    @Test
    public void shouldSumAnotherNumbers() {
        int result = FirstTask.function(123);

        assertEquals(5, result);
    }

    @Test
    public void shouldSumElementsOfNumber() {
        int result = FirstTask.function(1337);

        assertEquals(13, result);
    }
}
