package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void intTest_1() {
        int result = Factorial.intNumber(5);
        Assert.assertEquals(120, result);
    }

    @Test
    public void intTest_2() {
        int result = Factorial.intNumber(7);
        Assert.assertEquals(5040, result);
    }

    @Test
    public void intTest_3() {
        int result = Factorial.intNumber(10);
        Assert.assertEquals(3628800, result);
    }
}
