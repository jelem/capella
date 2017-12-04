package com.hillel.bendas;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TaskTwoTest {

  @Test
  public void shouldCutWordsInString() {
    String entered = "internationalization localization cat elephant monitor";
    String expected = "i18n l10n cat e6t m5r";
    String result = TaskTwo.cutWordsInString(entered);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldCutWordsInString2() {
    String entered = "hello my friend";
    String expected = "h3o my f4d";
    String result = TaskTwo.cutWordsInString(entered);
    assertThat(result, is(expected));
  }
}
