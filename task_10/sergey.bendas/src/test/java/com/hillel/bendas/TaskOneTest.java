package com.hillel.bendas;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TaskOneTest {

  @Test
  public void shouldChangeEmail() {
    String result = TaskOne.changeEmail("seregabendas@gmail.com");
    assertThat(result, is("seregabendas[ at ]gmail[ dot ]com"));
  }

  @Test
  public void shouldChangeEmail2() {
    String result = TaskOne.changeEmail("stupid_user@mail.ru");
    assertThat(result, is("stupid_user[ at ]mail[ dot ]ru"));
  }
}
