package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Homework11Test {

  @Test
  public void shouldTribonachiRecursion1() {
    int result = Homework11.tribonachiRecursion(0);
    assertThat(result, is(1));
  }

  @Test
  public void shouldTribonachiRecursion2() {
    int result = Homework11.tribonachiRecursion(3);
    assertThat(result, is(3));
  }

  @Test
  public void shouldTribonachiRecursion3() {
    int result = Homework11.tribonachiRecursion(8);
    assertThat(result, is(57));
  }

  @Test
  public void shouldTribonachiIterative1() {
    int result = Homework11.tribonachiIterative(0);
    assertThat(result, is(1));
  }

  @Test
  public void shouldTribonachiIterative2() {
    int result = Homework11.tribonachiIterative(3);
    assertThat(result, is(3));
  }

  @Test
  public void shouldTribonachiIterative3() {
    int result = Homework11.tribonachiIterative(8);
    assertThat(result, is(57));
  }
}

