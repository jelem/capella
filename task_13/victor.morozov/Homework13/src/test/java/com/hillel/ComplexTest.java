package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ComplexTest {

  @Test
  public void addTest() {
    Copmlex arg1 = new Copmlex(3, -2);
    Copmlex arg2 = new Copmlex(2, 4);
    String expected = "5.0+2.0i";
    arg1 = arg1.add(arg2);
    assertThat(arg1.toString(), is(expected));
  }

  @Test
  public void subTest() {
    Copmlex arg1 = new Copmlex(3, -2);
    Copmlex arg2 = new Copmlex(2, 4);
    String expected = "1.0-6.0i";
    arg1 = arg1.sub(arg2);
    assertThat(arg1.toString(), is(expected));
  }

  @Test
  public void multTest() {
    Copmlex arg1 = new Copmlex(3, -2);
    Copmlex arg2 = new Copmlex(2, 4);
    String expected = "14.0+8.0i";
    arg1 = arg1.mult(arg2);
    assertThat(arg1.toString(), is(expected));
  }

  @Test
  public void divTest() {
    Copmlex arg1 = new Copmlex(3, -2);
    Copmlex arg2 = new Copmlex(2, 4);
    String expected = "-0.1+0.4i";
    arg1 = arg1.div(arg2);
    assertThat(arg1.toString(), is(expected));
  }

  @Test
  public void sqrtPlusRootTest() {
    Copmlex arg1 = new Copmlex(3, 4);
    String expected = "2.0+1.0i";
    arg1 = arg1.sqrtPlusRoot();
    assertThat(arg1.toString(), is(expected));
  }

  @Test
  public void sqrtMinusRootTest() {
    Copmlex arg1 = new Copmlex(3, 4);
    String expected = "-2.0-1.0i";
    arg1 = arg1.sqrtMinusRoot();
    assertThat(arg1.toString(), is(expected));
  }
}
