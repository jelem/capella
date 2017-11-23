package dima.com;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestMaker {
  private static  final int[] arr = {1,2,7,8,12,23,27,32,33};

  @Test
  public void testSearchNoI(){
    boolean actual = ArrayMaker.binarySearch(arr,-777);
    boolean expected = false;
    assertEquals(actual, expected);
  }

  @Test
  public void testSearchNoII(){
    boolean actual = ArrayMaker.binarySearch(arr,3);
    boolean expected = false;
    assertEquals(actual, expected);
  }

  @Test
  public void testSearchNoIII(){
    boolean actual = ArrayMaker.binarySearch(arr,30);
    boolean expected = false;
    assertEquals(actual, expected);
  }

  @Test
  public void testSearchLeft(){
    boolean actual = ArrayMaker.binarySearch(arr,1);
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void testSearchMidle(){
    boolean actual = ArrayMaker.binarySearch(arr,12);
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRight(){
    boolean actual = ArrayMaker.binarySearch(arr,33);
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void TestSumNOI(){
    boolean actual = ArrayMaker.isSummInArray(arr, -12);
    boolean expected = false;
    assertEquals(actual, expected);
  }

  @Test
  public void TestSumNOII(){
    boolean actual = ArrayMaker.isSummInArray(arr, 4);
    boolean expected = false;
    assertEquals(actual, expected);
  }

  @Test
  public void TestSumYESI(){
    boolean actual = ArrayMaker.isSummInArray(arr, 10);
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void TestSumYESII(){
    boolean actual = ArrayMaker.isSummInArray(arr, 34);
    boolean expected = true;
    assertEquals(actual, expected);
  }

  @Test
  public void TestMergeArray_I(){
    int[] first  = {1,3,4,5,7};
    int[] second = {2,6};
    int[] actual = ArrayMaker.mergeTwoArrays(first,second);
    int[] expectedI = {1,2,3,4,5,6,7};
    assertArrayEquals(expectedI,actual);
  }

  @Test
  public void TestMergeArray_II(){
    int[] first  = {1,3,4,5,7};
    int[] second = {2,6};
    int[] actual = ArrayMaker.mergeTwoArrays(second,first);
    int[] expectedI = {1,2,3,4,5,6,7};
    assertArrayEquals(expectedI,actual);
  }

  @Test
  public void TestMergeArray_III(){
    int[] first  = {1,2,3,7};
    int[] second = {2,6};
    int[] actual = ArrayMaker.mergeTwoArrays(second,first);
    int[] expectedI = {1,2,2,3,6,7};
    assertArrayEquals(expectedI,actual);
  }
}
