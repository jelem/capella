package com.hillel;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomArrayListTest {

  @Test
  public void shouldContain() {
    CustomArrayList list = new CustomArrayList(10);
    list.add("one");
    list.add("two");
    list.add("three");

    boolean contain = list.contains("three");

    assertTrue(contain);
  }

  @Test
  public void shouldBeEmpty() {
    CustomArrayList list = new CustomArrayList(10);

    boolean isEmpty = list.isEmpty();

    assertTrue(isEmpty);
  }

  @Test
  public void shouldGet() {
    CustomArrayList list = new CustomArrayList(10);
    list.add("one");
    list.add("two");
    list.add("three");

    String get = list.get(1);

    assertTrue(get.equals("two"));
  }

  @Test
  public void shouldGetIndexOf() {
    CustomArrayList list = new CustomArrayList(10);
    list.add("one");
    list.add("two");
    list.add("three");

    int index = list.indexOf("three");

    assertEquals(2, index);
  }


}
