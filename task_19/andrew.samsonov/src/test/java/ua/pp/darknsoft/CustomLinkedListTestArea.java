package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Iterator;

public class CustomLinkedListTestArea {

  private static int INDEX_0 = 0;
  private static int INDEX_1 = 1;
  private static int INDEX_2 = 2;
  private static int ITEM_0 = 0;
  private static int ITEM_1 = 1;
  private static int ITEM_2 = 2;

  @Test
  public void addMethodTest() {
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    assertThat(list.get(INDEX_0), is(ITEM_0));
    assertThat(list.get(INDEX_1), is(ITEM_1));
  }

  @Test
  public void pollMethodTest() {
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    list.add(ITEM_2);
    assertThat(list.poll(), is(ITEM_0));
    assertThat(list.get(INDEX_0), is(ITEM_1));
  }

  @Test
  public void peekMethodTest() {
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    assertThat(list.peek(), is(ITEM_0));
    assertThat(list.get(INDEX_0), is(ITEM_0));
  }

  @Test
  public void getMethodTest() {
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    assertThat(list.get(INDEX_0), is(ITEM_0));
  }

  @Test
  public void introduceCycleMethodTest() {
    final int stopPoint = 20;
    int count = 0;
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    list.add(ITEM_2);
    list.introduceCycle(INDEX_1);
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      count++;
      iterator.next();
      if (count >= stopPoint) {
        break;
      }
    }
    assertThat(count, is(stopPoint));

  }

  @Test
  public void introduceCycleMethodTest2() {
    final int stopPoint = 7;
    int count = 0;
    int checkCount = -1;
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    list.add(ITEM_2);
    list.introduceCycle(INDEX_1);
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer tmp = (Integer) iterator.next();
      if (tmp.equals(ITEM_0)) {
        checkCount++;
      }
      count++;
      if (count >= stopPoint) {
        break;
      }
    }
    assertThat(checkCount, is(ITEM_0));

  }

  @Test
  public void hasCycleMethodTest() {
    CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
    list.add(ITEM_0);
    list.add(ITEM_1);
    list.add(ITEM_2);
    assertThat(list.hasCycle(), is(false));
    list.introduceCycle(INDEX_1);
    assertThat(list.hasCycle(), is(true));

  }

}
