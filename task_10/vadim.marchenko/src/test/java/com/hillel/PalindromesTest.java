package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void howManyPalindromes() throws Exception {
    String text = "deleveled, evitative, cat, dog, deified";
    String expectedResult = "There are 3 palindromes in this text";

    assertEquals(Palindromes.howManyPalindromes(text), expectedResult);
  }

}