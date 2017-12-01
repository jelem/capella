package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TaskOneTest {

  @Test
  public void shouldUniteTwoArrays() {
    int[] firstArray = {1, 2, 5, 6};
    int[] secondArray = {3, 8, 11};
    int[] expectedResult = {1, 2, 3, 5, 6, 8, 11};
    int[] result = TaskOne.uniteTwoArrays(firstArray, secondArray);
    assertThat(result, is(expectedResult));
  }

  @Test
  public void shouldUniteTwoArrays2() {
    int[] firstArray = {1};
    int[] secondArray = {2};
    int[] expectedResult = {1, 2};
    int[] result = TaskOne.uniteTwoArrays(firstArray, secondArray);
    assertThat(result, is(expectedResult));
  }

  @Test
  public void shouldUniteTwoArrays3() {
    int[] firstArray = {1};
    int[] secondArray = {1};
    int[] expectedResult = {1, 1};
    int[] result = TaskOne.uniteTwoArrays(firstArray, secondArray);
    assertThat(result, is(expectedResult));
  }

  @Test
  public void shouldUniteTwoArrays4() {
    int[] firstArray = {1, 2, 3, 6, 8, 9, 11, 13};
    int[] secondArray = {1, 5, 6, 10, 11, 13, 15, 16, 17, 18};
    int[] expectedResult = {1, 1, 2, 3, 5, 6, 6, 8, 9, 10, 11, 11, 13, 13, 15, 16, 17, 18};
    int[] result = TaskOne.uniteTwoArrays(firstArray, secondArray);
    assertThat(result, is(expectedResult));
  }

  @Test
  public void shouldUniteTwoArrays5() {
    int[] firstArray = {1, 2};
    int[] secondArray = {1};
    int[] expectedResult = {1, 1, 2};
    int[] result = TaskOne.uniteTwoArrays(firstArray, secondArray);
    assertThat(result, is(expectedResult));
  }
}
