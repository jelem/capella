package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ComplexNumberTest {

  @Test
  public void shouldAdd1() {
    ComplexNumber expected = new ComplexNumber(4, 4);
    ComplexNumber cn = new ComplexNumber(1, 1);
    ComplexNumber cn2 = new ComplexNumber(3, 3);
    ComplexNumber result = cn.add(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldAdd2() {
    ComplexNumber expected = new ComplexNumber(4, 6);
    ComplexNumber cn = new ComplexNumber(1, 2);
    ComplexNumber cn2 = new ComplexNumber(3, 4);
    ComplexNumber result = cn.add(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldAdd3() {
    ComplexNumber expected = new ComplexNumber(4, 4);
    ComplexNumber cn = new ComplexNumber(1, 1);
    ComplexNumber result = cn.add(3, 3);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldAdd4() {
    ComplexNumber expected = new ComplexNumber(4, 6);
    ComplexNumber cn = new ComplexNumber(1, 2);
    ComplexNumber result = cn.add(3, 4);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSub1() {
    ComplexNumber expected = new ComplexNumber(-1, 1);
    ComplexNumber cn = new ComplexNumber(1, 3);
    ComplexNumber cn2 = new ComplexNumber(2, 2);
    ComplexNumber result = cn.sub(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSub2() {
    ComplexNumber expected = new ComplexNumber(-2, -2);
    ComplexNumber cn = new ComplexNumber(1, 2);
    ComplexNumber cn2 = new ComplexNumber(3, 4);
    ComplexNumber result = cn.sub(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSub3() {
    ComplexNumber expected = new ComplexNumber(-1.9, -1.6);
    ComplexNumber cn = new ComplexNumber(1.4, 1.8);
    ComplexNumber result = cn.sub(3.3, 3.4);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSub4() {
    ComplexNumber expected = new ComplexNumber(1, 1);
    ComplexNumber cn = new ComplexNumber(1, 1);
    ComplexNumber result = cn.sub(0, 0);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldMul1() {
    ComplexNumber expected = new ComplexNumber(0, 2);
    ComplexNumber cn = new ComplexNumber(1, 1);
    ComplexNumber cn2 = new ComplexNumber(1, 1);
    ComplexNumber result = cn.mul(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldMul2() {
    ComplexNumber expected = new ComplexNumber(-5, 10);
    ComplexNumber cn = new ComplexNumber(1, 2);
    ComplexNumber cn2 = new ComplexNumber(3, 4);
    ComplexNumber result = cn.mul(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldMul3() {
    ComplexNumber expected = new ComplexNumber(-1.5, 10.7);
    ComplexNumber cn = new ComplexNumber(1.4, 1.8);
    ComplexNumber result = cn.mul(3.3, 3.4);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldMul4() {
    ComplexNumber expected = new ComplexNumber(-15, 23);
    ComplexNumber cn = new ComplexNumber(5, 1);
    ComplexNumber result = cn.mul(-2, 5);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldDiv1() {
    ComplexNumber expected = new ComplexNumber(4, 5);
    ComplexNumber cn = new ComplexNumber(4, 5);
    ComplexNumber cn2 = new ComplexNumber(0, 0);
    ComplexNumber result = cn.div(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldDiv2() {
    ComplexNumber expected = new ComplexNumber(1, 0);
    ComplexNumber cn = new ComplexNumber(1, 1);
    ComplexNumber cn2 = new ComplexNumber(1, 1);
    ComplexNumber result = cn.div(cn2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldDiv3() {
    ComplexNumber expected = new ComplexNumber(2.2, -0.4);
    ComplexNumber cn = new ComplexNumber(3, 4);
    ComplexNumber result = cn.div(1, 2);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldDiv4() {
    ComplexNumber expected = new ComplexNumber(1.28, 0.96);
    ComplexNumber cn = new ComplexNumber(0, 8);
    ComplexNumber result = cn.div(3, 4);
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSqrt1() {
    ComplexNumber expected = new ComplexNumber(2, 1);
    ComplexNumber cn = new ComplexNumber(3, 4);
    ComplexNumber result = cn.sqrt();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSqrt2() {
    ComplexNumber expected = new ComplexNumber(1, 0);
    ComplexNumber cn = new ComplexNumber(1, 0);
    ComplexNumber result = cn.sqrt();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldSqrt3() {
    ComplexNumber expected = new ComplexNumber(1, -2);
    ComplexNumber cn = new ComplexNumber(-3, -4);
    ComplexNumber result = cn.sqrt();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString() {
    String expected = "1 + 5i";
    ComplexNumber cn = new ComplexNumber(1, 5);
    String result = cn.toString();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString2() {
    String expected = "-1 - 5i";
    ComplexNumber cn = new ComplexNumber(-1, -5);
    String result = cn.toString();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString3() {
    String expected = "-1.85 - 5.12i";
    ComplexNumber cn = new ComplexNumber(-1.85, -5.12);
    String result = cn.toString();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString4() {
    String expected = "-5i";
    ComplexNumber cn = new ComplexNumber(0, -5);
    String result = cn.toString();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString5() {
    String expected = "-1";
    ComplexNumber cn = new ComplexNumber(-1, 0);
    String result = cn.toString();
    assertThat(result, is(expected));
  }

  @Test
  public void shouldToString6() {
    String expected = "0";
    ComplexNumber cn = new ComplexNumber(0, 0);
    String result = cn.toString();
    assertThat(result, is(expected));
  }
}
