package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomArrayTest {

  public CustomArray array = new CustomArray();

  @Test
  public void shouldCheckSize() {
    array.add("hello");
    array.add("world");
    int result = array.size();
    assertThat(result, is(2));
  }

  @Test
  public void shouldBeEmpty() {
    array.add("hello");
    boolean result = array.isEmpty();
    CustomArray array2 = new CustomArray();
    boolean result2 = array2.isEmpty();

    assertThat(result, is(false));
    assertThat(result2, is(true));
  }

  @Test
  public void shouldContain() {
    array.add("hello");
    boolean result = array.contains("hello");

    assertThat(result, is(true));
  }

  @Test
  public void shouldAddByIndex() {
    array.add("you");
    array.add("you");
    array.add("you");
    array.add("you");
    array.add(2, "for");
    boolean result = array.contains("for");

    assertThat(result, is(true));
  }

  @Test
  public void shouldRemove() {
    array.add("you");
    array.add("you");
    array.add("for");
    array.add("you");
    boolean result = array.remove("for");

    assertThat(result, is(true));
  }

  @Test
  public void shouldRemoveByIndex() {
    array.add("you");
    array.add("you");
    array.add("for");
    array.add("you");
    String result = array.remove(2);

    assertThat(result, is("for"));
  }

  @Test
  public void shouldGet() {
    array.add("you");
    array.add("you");
    array.add("for");
    array.add("you");
    String result = array.get(2);

    assertThat(result, is("for"));
  }

  @Test
  public void shouldSet() {
    array.add("you");
    array.add("you");
    array.add("for");
    array.add("you");
    array.set(2, "how are");
    String result = array.get(2);
    assertThat(result, is("how are"));
  }

  @Test
  public void shouldIndex() {
    array.add("you");
    array.add("you");
    array.add("for");
    array.add("you");
    int result = array.indexOf("for");

    assertThat(result, is(2));
  }


}
