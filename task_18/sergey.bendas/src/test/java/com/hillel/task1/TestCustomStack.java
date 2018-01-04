package com.hillel.task1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.hillel.task1.CustomStack;

import org.junit.Test;

public class TestCustomStack {

  @Test
  public void shouldMinElement() {
    CustomStack stack = new CustomStack(5);
    stack.push(2);
    int result = stack.min();
    assertThat(result, is(2));

    stack.push(4);
    result = stack.min();
    assertThat(result, is(2));

    stack.push(8);
    result = stack.min();
    assertThat(result, is(2));

    stack.push(1);
    result = stack.min();
    assertThat(result, is(1));

    stack.pop();
    result = stack.min();
    assertThat(result, is(2));

    stack.pop();
    stack.pop();
    stack.pop();
  }

  @Test
  public void shouldMaxElement() {
    CustomStack stack = new CustomStack(5);
    stack.push(2);
    int result = stack.max();
    assertThat(result, is(2));

    stack.push(4);
    result = stack.max();
    assertThat(result, is(4));

    stack.push(3);
    result = stack.max();
    assertThat(result, is(4));

    stack.push(8);
    result = stack.max();
    assertThat(result, is(8));

    stack.push(8);
    result = stack.max();
    assertThat(result, is(8));

    stack.pop();
    result = stack.max();
    assertThat(result, is(8));

    stack.pop();
    result = stack.max();
    assertThat(result, is(4));
  }
}
