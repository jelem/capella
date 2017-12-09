package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordShorteningTest {

  @Test
  public void reductionTest() {
    String word1 = "internationalization";
    String word1Expected = "i18n";
    assertEquals(WordShortening.reduction(word1), word1Expected);

    String word2 = "localization";
    String word2Expected = "l10n";
    assertEquals(WordShortening.reduction(word2), word2Expected);

    String word3 = "cat";
    String word3Expected = "cat";
    assertEquals(WordShortening.reduction(word3), word3Expected);

    String word4 = "elephant";
    String word4Expected = "e6t";
    assertEquals(WordShortening.reduction(word4), word4Expected);

    String word5 = "monitor";
    String word5Expected = "m5r";
    assertEquals(WordShortening.reduction(word5), word5Expected);
  }

}