package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReplaceInStringTest {

  @Test
  public void souldReplaceInString() {

    String result = ReplaceInStrings.replaceInString("person@gmail.com");

    assertThat(result, is("person[ at ]gmail[ dot ]com"));
  }
}
