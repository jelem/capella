package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TaskThreeTest {

  @Test
  public void shouldMaxLessValue1() {
    int[] testArray = {1, 4, 6, 7, 9, 10, 11, 12};
    int result = TaskThree.indexOfMaxPossibleValue(10, testArray);
    assertThat(result, is(4));
  }

  @Test
  public void shouldMaxLessValue2() {
    int[] testArray = {1, 4, 6, 7, 9, 10, 11, 12};
    int result = TaskThree.indexOfMaxPossibleValue(14, testArray);
    assertThat(result, is(7));
  }

  @Test
  public void shouldMaxLessValue3() {
    int[] testArray = {1, 4, 6, 7, 9, 10, 11, 12};
    int result = TaskThree.indexOfMaxPossibleValue(8, testArray);
    assertThat(result, is(3));
  }

  @Test
  public void shouldMaxLessValue4() {
    int[] testArray = {-4, -3, -2, 1, 4, 6, 7, 9, 10, 11, 12};
    int result = TaskThree.indexOfMaxPossibleValue(4, testArray);
    assertThat(result, is(6));
  }

  @Test
  public void shouldIsSumInArray1() {
    int[] testArray = {1, 2, 3, 4, 8, 10};
    boolean result = TaskThree.isSumInArray1(3, testArray);
    assertThat(result, is(true));
  }

  @Test
  public void shouldIsSumInArray2() {
    int[] testArray = {1, 2, 3, 4, 8, 10};
    boolean result = TaskThree.isSumInArray1(8, testArray);
    assertThat(result, is(false));
  }

  @Test
  public void shouldIsSumInArray3() {
    int[] testArray = {-4, -1, 0, 1, 5, 8, 11, 20};
    boolean result = TaskThree.isSumInArray1(7, testArray);
    assertThat(result, is(true));
  }

  @Test
  public void shouldIsSumInArray4() {
    int[] testArray = {-4, -1, 0, 5, 8, 11, 20};
    boolean result = TaskThree.isSumInArray1(4, testArray);
    assertThat(result, is(true));
  }

  @Test
  public void shouldIsSumInArray5() {
    int[] testArray = {-4, -1, 0, 5, 8, 11, 20};
    boolean result = TaskThree.isSumInArray1(6, testArray);
    assertThat(result, is(false));
  }

  @Test
  public void shouldIsSumInArray6() {
    int[] testArray = {-4, 4};
    boolean result = TaskThree.isSumInArray1(0, testArray);
    assertThat(result, is(true));
  }

  @Test
  public void shouldIsSumInArray7() {
    int[] testArray = {-4, 4};
    boolean result = TaskThree.isSumInArray1(1, testArray);
    assertThat(result, is(false));
  }

  @Test
  public void shouldIsSumInArray8() {
    int[] testArray = {1, 2, 3, 5, 5, 5, 5};
    boolean result = TaskThree.isSumInArray1(10, testArray);
    assertThat(result, is(true));
  }
}
