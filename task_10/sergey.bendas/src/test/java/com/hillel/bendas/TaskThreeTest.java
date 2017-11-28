package com.hillel.bendas;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TaskThreeTest {

  @Test
  public void shouldCountPalindromes() {
    String str = "deleveled, evitative, cat, dog, deified";
    int result = TaskThree.countPalindromes(str);
    assertThat(result, is(3));
  }

  @Test
  public void shouldCountPalindromes2() {
    String str = "malayalam, deed, hello, level, reviver";
    int result = TaskThree.countPalindromes(str);
    assertThat(result, is(4));
  }

  @Test
  public void shouldCountPalindromes3() {
    String str = "lol, kek, cheburek";
    int result = TaskThree.countPalindromes(str);
    assertThat(result, is(2));
  }
}
