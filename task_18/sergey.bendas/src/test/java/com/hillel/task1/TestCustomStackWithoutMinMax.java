package com.hillel.task1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.task1.CustomStackWithoutMinMax;

import org.junit.Test;

import java.util.EmptyStackException;

public class TestCustomStackWithoutMinMax {

  @Test
  public void shouldPushPopPeak() {
    CustomStackWithoutMinMax stack = new CustomStackWithoutMinMax(5);
    stack.push(2);
    stack.push(4);
    stack.push(8);
    int result = stack.peek();
    assertThat(result, is(8));
    result = stack.pop();
    assertThat(result, is(8));
    result = stack.pop();
    assertThat(result, is(4));
    result = stack.peek();
    assertThat(result, is(2));
    result = stack.pop();
    assertThat(result, is(2));
    try {
      stack.pop();
    } catch (Exception exception) {
      assertThat(exception.toString(), is(new EmptyStackException().toString()));
    }
  }
}
