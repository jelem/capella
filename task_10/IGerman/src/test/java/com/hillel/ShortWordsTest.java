package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ShortWordsTest {

  @Test
  public void shouldMakeShortWords() {

    String result = ShortWords
        .makingShortWords("internationalization localization cat elephant monitor");

    assertThat(result, is("i18n l10n cat e6t m5r"));

  }

}
