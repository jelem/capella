package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StringOpportunityTest {

  @Test
  public void replacementOfSymbolsTest() {
    String testStr = StringsOpportunity.replacementOfSymbols("teacherluke@podomatic.com");
    assertThat(testStr, is("teacherluke[ at ]podomatic[ dot ]com"));
  }

  @Test
  public void numericValueOfSymbolsTest() {
    String testStr = StringsOpportunity.numericValueOfSymbols("internationalization");
    assertThat(testStr, is("i18n"));
  }
  @Test
  public void numericValueOfSymbolsTestForShort() {
    String testStr = StringsOpportunity.numericValueOfSymbols("cat");
    assertThat(testStr, is("cat"));
  }

  @Test
  public void palindromeTest() {
    int count = StringsOpportunity.palindrome("deleveled, evitative, cat, dog, deified");
    assertThat(count, is(3));
  }

}
