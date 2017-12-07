package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordShorteningTest {

  @Test
  public void reductionTest() {
    String word1 = "internationalization";
    String word1Expected = "i18n";

    String word2 = "localization";
    String word2Expected = "l10n";

    String word3 = "cat";
    String word3Expected = "cat";

    String word4 = "elephant";
    String word4Expected = "e6t";

    String word5 = "monitor";
    String word5Expected = "m5r";

    assertEquals(WordShortening.reduction(word1), word1Expected);
    assertEquals(WordShortening.reduction(word2), word2Expected);
    assertEquals(WordShortening.reduction(word3), word3Expected);
    assertEquals(WordShortening.reduction(word4), word4Expected);
    assertEquals(WordShortening.reduction(word5), word5Expected);
  }

}