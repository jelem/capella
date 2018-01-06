package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.NoSuchElementException;

public class CustomArrayListTest {


  @Test
  public void shouldSize0() {
    CustomList list = new CustomArrayList();
    int result = list.size();
    assertThat(result, is(0));
  }

  @Test
  public void shouldEmpty0() {
    CustomList list = new CustomArrayList();
    boolean result = list.isEmpty();
    assertThat(result, is(true));
  }

  @Test
  public void shouldContains0() {
    CustomList list = new CustomArrayList();
    boolean result = list.contains("hello");
    assertThat(result, is(false));
  }

  @Test
  public void shouldAddValues0() {
    CustomList list = new CustomArrayList();
    list.add("hello");
    list.add("World");
    boolean result0 = list.contains("World");
    assertThat(result0, is(true));

    int result1 = list.size();
    assertThat(result1, is(2));
  }

  @Test
  public void shouldAddValues1() {
    CustomList list = new CustomArrayList();
    list.add("hello");
    list.add("World");
    list.add(1, "my");
    list.add(3, "!");

    boolean result0 = list.contains("my");
    assertThat(result0, is(true));

    int result1 = list.size();
    assertThat(result1, is(4));

    String result2 = list.get(2);
    assertThat(result2, is("World"));
  }

  @Test
  public void shouldAddValues2() {
    CustomList list = new CustomArrayList();
    for (int i = 0; i < 145; i++) {
      list.add("Hello");
    }
    int result = list.size();
    assertThat(result, is(145));
  }

  @Test
  public void shouldAddValues3() {
    CustomList list = new CustomArrayList();
    try {
      list.add(10, "Hahaha");
    } catch (Exception exception) {
      assertThat(exception.toString(), is(new NoSuchElementException().toString()));
    }
  }

  @Test
  public void shouldRemove0() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    list.remove("my");

    boolean result0 = list.contains("my");
    assertThat(result0, is(false));

    int result1 = list.size();
    assertThat(result1, is(3));

    String result2 = list.get(2);
    assertThat(result2, is("!"));
  }

  @Test
  public void shouldRemove1() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");

    String result0 = list.remove(1);
    assertThat(result0, is("my"));

    boolean result1 = list.contains("my");
    assertThat(result1, is(false));

    int result2 = list.size();
    assertThat(result2, is(3));

    String result3 = list.get(1);
    assertThat(result3, is("World"));
  }

  @Test
  public void shouldRemove2() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    try {
      list.remove(5);
    } catch (Exception exception) {
      assertThat(exception.toString(), is(new NoSuchElementException().toString()));
    }
  }

  @Test
  public void shouldClear() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    list.add("goodbye");
    list.clear();

    int result = list.size();
    assertThat(result, is(0));
  }

  @Test
  public void shouldSet0() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    list.set(0, "goodbye");

    boolean result0 = list.contains("hello");
    assertThat(result0, is(false));

    int result1 = list.size();
    assertThat(result1, is(4));

    String result2 = list.get(0);
    assertThat(result2, is("goodbye"));
  }

  @Test
  public void shouldSet1() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    try {
      list.set(5, "goodbye");
    } catch (Exception exception) {
      assertThat(exception.toString()
              .equals(new ArrayIndexOutOfBoundsException().toString()),
          is(false));
    }
  }

  @Test
  public void shouldSet2() {
    CustomList list = new CustomArrayList();
    list.add(0, "hello");
    list.add(1, "World");
    list.add(1, "my");
    list.add(3, "!");
    try {
      list.set(5, "goodbye");
    } catch (Exception exception) {
      assertThat(exception.toString()
              .equals(new NoSuchElementException().toString()),
          is(true));
    }
  }
}
