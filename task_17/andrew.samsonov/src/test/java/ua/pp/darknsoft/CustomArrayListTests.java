package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.NoSuchElementException;

public class CustomArrayListTests {

  private static final String HELLO = "hello";
  private static final String WORLD = "world";
  private static final String WORD = "word";
  private static final String INDEX_1 = "index_1";
  private static final String INDEX_0 = "index_0";
  private static final String INDEX_5 = "index_5";
  private CustomList<String> myList;

  @Test
  public void testSizeV01() {
    myList = new CustomArrayList<>();
    assertThat(0, is(myList.size()));
  }

  @Test
  public void testSizeV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(2, is(myList.size()));
  }

  @Test
  public void testIsEmptyV01() {
    myList = new CustomArrayList<>();
    assertThat(true, is(myList.isEmpty()));
  }

  @Test
  public void testIsEmptyV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(false, is(myList.isEmpty()));
  }

  @Test
  public void testContainsV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(true, is(myList.contains(HELLO)));
  }

  @Test
  public void testContainsV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(false, is(myList.contains(WORD)));
  }

  @Test
  public void testAddV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(HELLO, is(myList.get(0)));
    assertThat(WORLD, is(myList.get(1)));
  }

  @Test
  public void testAddByIndexV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.add(0, INDEX_0);
    myList.add(1, INDEX_1);
    assertThat(INDEX_0, is(myList.get(0)));
    assertThat(INDEX_1, is(myList.get(1)));
    assertThat(HELLO, is(myList.get(2)));
    assertThat(WORLD, is(myList.get(3)));
    assertThat(4, is(myList.size()));
  }

  @Test
  public void testAddByIndexV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    try {
      myList.add(5, INDEX_5);
      fail("Expected an NoSuchElementException to be thrown");
    } catch (NoSuchElementException anNoSuchElementException) {
      assertThat(anNoSuchElementException.getMessage(), is("Wrong index"));
    }
  }

  @Test
  public void testRemoveV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.remove(1);
    assertThat(HELLO, is(myList.get(0)));
    assertThat(1, is(myList.size()));
  }

  @Test
  public void testRemoveV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.remove(1);
    try {
      myList.get(1);
      fail("Expected an NoSuchElementException to be thrown");
    } catch (NoSuchElementException anNoSuchElementException) {
      assertThat(anNoSuchElementException.getMessage(), is("Wrong index"));
    }
  }

  @Test
  public void testRemoveByElementV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(true, is(myList.remove(HELLO)));
    assertThat(WORLD, is(myList.get(0)));
    assertThat(1, is(myList.size()));
  }

  @Test
  public void testRemoveByElementV02() {
    myList = new CustomArrayList<>();
    myList.add("hello");
    myList.add(WORLD);
    assertThat(false, is(myList.remove(WORD)));
    assertThat(HELLO, is(myList.get(0)));
    assertThat(2, is(myList.size()));
  }

  @Test
  public void testClearV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.clear();
    assertThat(0, is(myList.size()));
  }

  @Test
  public void testClearV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.clear();
    try {
      myList.get(1);
      fail("Expected an NoSuchElementException to be thrown");
    } catch (NoSuchElementException anNoSuchElementException) {
      assertThat(anNoSuchElementException.getMessage(), is("Wrong index"));
    }
  }

  @Test
  public void testSetV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.set(0, INDEX_0);
    assertThat(INDEX_0, is(myList.get(0)));
  }

  @Test
  public void testSetV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    myList.set(1, INDEX_1);
    assertThat(2, is(myList.size()));
  }

  @Test
  public void testIndexOfV01() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(0, is(myList.indexOf(HELLO)));
  }

  @Test
  public void testIndexOfV02() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(1, is(myList.indexOf(WORLD)));
  }

  @Test
  public void testIndexOfV03() {
    myList = new CustomArrayList<>();
    myList.add(HELLO);
    myList.add(WORLD);
    assertThat(-1, is(myList.indexOf(WORD)));
  }

}
