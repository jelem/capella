package com.dima;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperForChangeTest {

  @Test
  public void changedString() {

    String str = "person@gmail.com";
    str = WrapperForChange.changedString(str);
    String expected = "person[at]gmail[dot].com";
    assertEquals(expected, str);
  }

  @Test
  public void isStringIncludeCharTest_1() {

    String str = "person@gmail.com";
    boolean actual = WrapperForChange.isStringIncludeChar(str, '.');
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void isStringIncludeCharTest_2() {

    String str = "person@gmail.com";
    boolean actual = WrapperForChange.isStringIncludeChar(str, '@');
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void isStringIncludeCharTest_3() {

    String str = "person@gmail.com";
    boolean actual = WrapperForChange.isStringIncludeChar(str, '+');
    boolean expected = false;
    assertEquals(actual, expected);
  }
}
