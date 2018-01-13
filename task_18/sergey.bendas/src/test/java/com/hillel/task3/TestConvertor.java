package com.hillel.task3;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestConvertor {

  @Test
  public void shouldIntToBin1() {
    String result = Convertor.intToBin(10);
    assertThat(result, is("1010"));
  }

  @Test
  public void shouldIntToBin2() {
    String result = Convertor.intToBin(16);
    assertThat(result, is("10000"));
  }
}
