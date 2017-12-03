package com.hillel;


import static com.hillel.StringFunctions.countPalimdroms;
import static com.hillel.StringFunctions.emailConvert;
import static com.hillel.StringFunctions.shorteningString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringFunctionsTest {

  @Test
  public void emailConvertTest() {
    String expected = "person[ at ]gmail[ dot ]com";
    String result = emailConvert("person@gmail.com");

    assertThat(result, is(expected));
  }

  @Test
  public void shorteningStringTest() {
    String expected = "i18n l10n cat e6t m5r";
    String result = shorteningString("internationalization localization cat elephant monitor");

    assertThat(result, is(expected));
  }

  @Test
  public void countPalindromsTest() {
    String expected = "There are 3 palindromes in the text";
    String result = countPalimdroms("deleveled, evitative, cat, dog, deified ");

    assertThat(result, is(expected));
  }
}
