package com.dima;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EasyListTest {

  @Test
  public void testBinarySearch() {
    EasyList easyList = new EasyList();
    int actual = easyList.binarySearch(-1);
    assertEquals(-1, actual);
    actual = easyList.binarySearch(9);
    assertEquals(-1, actual);
    actual = easyList.binarySearch(0);
    assertEquals(0, actual);
    actual = easyList.binarySearch(8);
    assertEquals(8, actual);
    actual = easyList.binarySearch(4);
    assertEquals(4, actual);
    actual = easyList.binarySearch(1);
    assertEquals(1, actual);
  }

  @Test
  public void testRemoveToIndex() {
    EasyList easyList = new EasyList();
    easyList.removeToIndex(4);
    int actual = easyList.get(0);
    assertEquals(0, actual);
    actual = easyList.get(4);
    assertEquals(5, actual);
    actual = easyList.get(7);
    assertEquals(8, actual);
    easyList.removeToIndex(0);
    actual = easyList.get(0);
    assertEquals(1, actual);
    actual = easyList.get(4);
    assertEquals(6, actual);
    actual = easyList.getLen();
    assertEquals(7, actual);
  }

  @Test
  public void testCreateRandom() {
    int rand = 0;
    int left = 0;
    int right = 9;
    boolean result = true;
    for (int i = 0, j = 0; i < right && result; i++) {
      while ((rand = BaseList.createRandom(right)) != i) {
        if (rand >= right || rand < 0) {
          result = false;
          break;
        }
      }
      j++;
    }
    assertEquals(true, result);
  }
}
