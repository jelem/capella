package com.dima;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class RecurtionTest {

  @Test
  public void testFirstEleemOfFibonazi() {
    int actual = Recurtion.theSameOfFibonazi(1);
    int expected = 1;
    assertEquals(actual, expected);
  }

  @Test
  public void testFourthEleemOfFibonazi() {
    int actual = Recurtion.theSameOfFibonazi(4);
    int expected = 3;
    assertEquals(actual, expected);
  }

  @Test
  public void tesSeventhEleemOfFibonazi() {
    int actual = Recurtion.theSameOfFibonazi(7);
    int expected = 17;
    assertEquals(actual, expected);
  }

  /////////////////////////////////////////////////

  @Test
  public void testFirstEleemOfIteraty() {
    int actual = Recurtion.iteratyFibonazi(1);
    int expected = 1;
    assertEquals(actual, expected);
  }

  @Test
  public void testFourthEleemOfIteraty() {
    int actual = Recurtion.iteratyFibonazi(4);
    int expected = 3;
    assertEquals(actual, expected);
  }

  @Test
  public void testSeventhEleemOfIteraty() {
    int actual = Recurtion.iteratyFibonazi(7);
    int expected = 17;
    assertEquals(actual, expected);
  }
}


