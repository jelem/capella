package com.hillel.task4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestBalance {

  @Test
  public void shouldBalanceInBrackets1() {
    boolean result = CheckBalance.isBalanceInBrackets("((({}()[])))");
    assertThat(result, is(true));
  }

  @Test
  public void shouldBalanceInBrackets2() {
    boolean result = CheckBalance.isBalanceInBrackets("(({)})");
    assertThat(result, is(false));
  }

  @Test
  public void shouldBalanceInBrackets3() {
    boolean result = CheckBalance.isBalanceInBrackets("{([])}");
    assertThat(result, is(true));
  }
}
