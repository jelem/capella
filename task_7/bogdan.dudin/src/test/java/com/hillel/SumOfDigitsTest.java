package com.hillel;


import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsTest {

    @Test
    public void intTest_1() {
        int result = SumOfDigits.intNumber(123543);
        Assert.assertEquals(18, result);
    }

    @Test
    public void intTest_2() {
        int result = SumOfDigits.intNumber(777);
        Assert.assertEquals(21, result);
    }

    @Test
    public void intTest_3() {
        int result = SumOfDigits.intNumber(1001243);
        Assert.assertEquals(11, result);
    }
}
