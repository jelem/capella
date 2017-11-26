package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class PerimeterSquareTest {

    @Test
    public void intTest_1() {
        int result = PerimeterSquare.calculation(5, "perimeter");
        Assert.assertEquals(20, result);
    }

    @Test
    public void intTest_2() {
        int result = PerimeterSquare.calculation(5, "square");
        Assert.assertEquals(25, result);
    }

    @Test
    public void intTest_3() {
        int result = PerimeterSquare.calculation(5, "plocshad");
        Assert.assertEquals(0, result);
    }
}
