package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomStackTest {

  CustomStack stack = new CustomStack();

  @Test
  public void shouldSomething() {
    stack.push(5);
    stack.push(6);
    stack.push(4);
    stack.push(8);
    stack.push(1);
    stack.push(7);
    stack.push(5);

    int result = stack.max();
    assertThat(result, is(8));
  }

  @Test
  public void shouldMinimum() {
    stack.push(5);
    stack.push(6);
    stack.push(4);
    stack.push(8);
    stack.push(1);
    stack.push(7);
    stack.push(5);

    int result = stack.min();
    assertThat(result, is(1));
  }

  @Test
  public void shouldPush() {
    stack.push(5);
    int result = stack.peek();
    assertThat(result, is(5));
  }

  @Test
  public void shouldPop() {
    stack.push(5);
    stack.push(4);
    int result = stack.pop();
    assertThat(result, is(5));
  }
}
