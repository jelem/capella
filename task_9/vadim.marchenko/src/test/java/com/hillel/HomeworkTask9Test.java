package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HomeworkTask9Test {

  @Test
  public void sortArraysTest() {
    int[] array1 = {1, 5, 3};
    int[] array2 = {2, 9, 8, 4, 12};
    int[] arraySorted = {1, 2, 3, 4, 5, 8, 9, 12};
    assertArrayEquals(arraySorted, HomeworkTask9.sortArrays(array1, array2));
  }

  @Test
  public void checkElementsSumTest() {
    int[] array = {1, 3, 5, 7, 9};
    boolean found = HomeworkTask9.checkElementsSum(array, 10);
    assertThat(found, is(true));
  }

}