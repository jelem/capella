package com.dima;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WrapperForPalindromeMethodTest {

  @Test
  public void isPolindromeTestCat() {
    String str = "cat";
    boolean actual = WrapperForPalindromeMethod.isPolindrome(str);
    boolean expected = false;
    assertEquals(actual,expected);
  }

  @Test
  public void isPolindromeTestDog() {
    String str = "dog";
    boolean actual = WrapperForPalindromeMethod.isPolindrome(str);
    boolean expected = false;
    assertEquals(actual,expected);
  }

  @Test
  public void isPolindromeTestDeleveled() {
    String str = "deleveled";
    boolean actual = WrapperForPalindromeMethod.isPolindrome(str);
    boolean expected = true;
    assertEquals(actual,expected);
  }

  @Test
  public void isPolindromeTestDeified() {
    String str = "deified";
    boolean actual = WrapperForPalindromeMethod.isPolindrome(str);
    boolean expected = true;
    assertEquals(actual,expected);
  }

  @Test
  public void sayCountOfPolindromsTest() {
    String text = "deleveled, evitative, cat, dog, deified";
    String actual = WrapperForPalindromeMethod.sayCountOfPolindroms(text);
    String expected = "There are 3 palindromes in the text";
    assertEquals(actual,expected);
  }

  @Test
  public void sayCountOfPolindromsTestWithSpaces() {
    String text = "  deleveled , evitative  ,     cat ,   dog  ,    deified     ";
    String actual = WrapperForPalindromeMethod.sayCountOfPolindroms(text);
    String expected = "There are 3 palindromes in the text";
    assertEquals(actual,expected);
  }
}
