package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void shouldFindPalindromes() {

    int result = Palindromes.findPalindromes1("deleveled, evitative, cat, dog, deified");

    assertEquals(3, result);
  }

  @Test
  public void shouldFindPalindromes2() {

    int result = Palindromes.findPalindromes2("deleveled, evitative, cat, dog, deified");

    assertEquals(3, result);
  }

  @Test
  public void shouldCountTime() {

    long beforeWithArray = System.nanoTime();
    Palindromes.findPalindromes1("deleveled, evitative, cat, dog, deified");

    long afterWithArray = System.nanoTime();
    System.out.println("findPalindromes1 with Arrays - " + (afterWithArray - beforeWithArray));

    long beforeWithStringBuilder = System.nanoTime();
    Palindromes.findPalindromes2("deleveled, evitative, cat, dog, deified");

    long afterWithStringBuilder = System.nanoTime();
    System.out.println("findPalindromes2 with StringBuilder - " + (afterWithStringBuilder
        - beforeWithStringBuilder));
  }
}
