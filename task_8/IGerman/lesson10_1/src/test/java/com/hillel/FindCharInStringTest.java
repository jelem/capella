package com.hillel;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by User on 26.11.2017.
 */
public class FindCharInStringTest {

    @Test
    public void testCount(){
        int result = FindCharinString.count ("Hello World", 'l');

        assertThat(result, is(3));
    }
}
