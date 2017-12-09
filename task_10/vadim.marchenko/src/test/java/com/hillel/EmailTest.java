package com.hillel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailTest {

  @Test
  public void emailChangeTest() {
    String email1 = "Wardomir@gmail.com";
    String email1Expected = "Wardomir at gmail dot com";
    String email2 = "Petya@rambler.ru";
    String email2Expected = "Petya at rambler dot ru";
    String email3 = "Vasyan2000@mail.ru";
    String email3Expected = "Vasyan2000 at mail dot ru";

    assertEquals(Email.emailChange(email1), email1Expected);
    assertEquals(Email.emailChange(email2), email2Expected);
    assertEquals(Email.emailChange(email3), email3Expected);
  }

}