package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestCustomLinkedList {
  @Test
  public void shouldCustomLinkedList() {
    CustomLinkedList list = new CustomLinkedList();
    list.add(2);
    list.add(4);
    list.add(8);
    list.add(12);
    list.add(3);

    int result = list.peek();
    assertThat(result, is(2));

    result = list.get(3);
    assertThat(result, is(12));

    result = list.poll();
    assertThat(result, is(2));

    result = list.poll();
    assertThat(result, is(4));

    result = list.peek();
    assertThat(result, is(8));

    result = list.poll();
    assertThat(result, is(8));

    list.add(2);
    list.add(32);
    list.add(15);
    boolean result1 = list.hasCycle();
    assertThat(result1, is(false));
    list.introduceCycle(1);
    result1 = list.hasCycle();
    assertThat(result1, is(true));
  }
}
