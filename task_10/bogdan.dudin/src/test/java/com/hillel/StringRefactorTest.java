package com.hillel;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringRefactorTest {

  @Test
  public void shouldReplaceEmailSymbols_1() {
    String result  = StringRefactor.replaceEmailSymbols("exemple@email.com");

    assertEquals("exemple[ at ]email[ dot ]com", result);
  }

  @Test
  public void shouldReplaceEmailSymbols_2() {
    String result  = StringRefactor.replaceEmailSymbols("bogdan.dudin@email.com");

    assertEquals("bogdan[ dot ]dudin[ at ]email[ dot ]com", result);
  }

  @Test
  public void shouldMakeShortWords_1() {
    String[] expected = {"i18n", "l10n", "cat", "e6t", "m5r"};

    String[] result = StringRefactor.shortWords("internationalization localization cat elephant monitor");

    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldMakeShortWords_2() {
    String[] expected = {"c7y", "e8n", "dog", "s3k", "h2p", "e5e"};

    String[] result = StringRefactor.shortWords("community expression dog stack heap execute");

    assertArrayEquals(expected, result);
  }

  @Test
  public void shouldReturnQuantityOfPalindromes_1() {
    int result = StringRefactor.howMathPalindromes("deleveled, evitative, cat, dog, deified");

    assertEquals(3, result);
  }

  @Test
  public void shouldReturnQuantityOfPalindromes_2() {
    int result = StringRefactor.howMathPalindromes("rotator, pullup, radar, stack, anna, heap");

    assertEquals(4, result);
  }
}
