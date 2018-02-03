package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TrainTest {

  private static Train train = new Train.Builder()
      .carriage(36)
      .carriage(36)
      .carriage(24)
      .build();

  @Test
  public void shouldCheckException1() {
    Place place = train.getPlace();
    assertThat(place != null, is(true));
  }

  @Test
  public void shouldCheckException2() {
    Place place = null;
    try {
      place = train.getPlace(0, 2);
    } catch (NoSuchPlaceException exception) {
      assertThat(true, is(false));
    }
    assertThat(place, is(new Place(0, 2)));
  }

  @Test
  public void shouldCheckException3() {
    Place place = null;
    try {
      place = train.getPlace(0, 2);
    } catch (NoSuchPlaceException exception) {
      assertThat(exception.getMessage(), is("Such place is not available"));
    }
    assertThat(place == null, is(true));
  }

  @Test
  public void shouldCheckException4() {
    Place place = null;
    try {
      place = train.getPlace(3, 2);
    } catch (NoSuchPlaceException exception) {
      assertThat(exception.getMessage(), is("This train has just 3 carriages"));
    }
    assertThat(place == null, is(true));
  }

  @Test
  public void shouldCheckException5() {
    Place place = null;
    try {
      place = train.getPlace(1, 25);
    } catch (NoSuchPlaceException exception) {
      assertThat(true, is(false));
    }
    assertThat(place, is(new Place(1, 25)));
  }

  @Test
  public void shouldCheckException6() {
    Place place = null;
    try {
      place = train.getPlace(2, 25);
    } catch (NoSuchPlaceException exception) {
      assertThat(exception.getMessage(), is("This carriage has just 24 places"));
    }
    assertThat(place == null, is(true));
  }

  @Test
  public void shouldCheckException7() {
    while (train.hasPlaces()) {
      train.getPlace();
    }
    Place place = null;
    try {
      place = train.getPlace(0, 0);
    } catch (Exception exception) {
      assertThat(exception.getClass() == NoPlacesException.class, is(true));
    }
    assertThat(place == null, is(true));
  }

  @Test
  public void shouldCheckException8() {
    while (train.hasPlaces()) {
      train.getPlace();
    }
    Place place = null;
    try {
      place = train.getPlace(-1, 0);
    } catch (Exception exception) {
      assertThat(exception.getClass() == WrongPlaceException.class, is(true));
    }
    assertThat(place == null, is(true));
  }

  @Test
  public void shouldCheckException9() {
    while (train.hasPlaces()) {
      train.getPlace();
    }
    Place place = null;
    try {
      place = train.getPlace(1, -10);
    } catch (Exception exception) {
      assertThat(exception.getClass() == WrongPlaceException.class, is(true));
    }
    assertThat(place == null, is(true));
  }
}
