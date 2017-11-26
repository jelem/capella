package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelixTest {

    @Test
    public void shouldBuildHelixArray() {
        int[][] helixArrayExpected = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        int[][] helixArrayResult = Helix.build(4);

        assertEquals(helixArrayExpected, helixArrayResult);
    }
}
