package com.dima;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperForTest {

  @Test
  public void convertToBriefTestForLongWord() {
    String str = "internationalization";
    String actual =  WrapperForMethods.convertToBrief(str);
    String expected = "i18n";
    assertEquals(actual, expected);
  }

  @Test
  public void convertToBriefTestShortWord() {
    String str = "cat";
    String actual =  WrapperForMethods.convertToBrief(str);
    String expected = "cat";
    assertEquals(actual, expected);
  }

  @Test
  public void SplitAndConvertToBriefTest() {
    String str = "internationalization localization cat elephant monitor";
    String[] actual = WrapperForMethods.splitAndConvertToBrief(str);
    String[] expected = {"i18n", "l10n", "cat", "e6t", "m5r"};
    assertEquals(actual,expected);
  }
}
