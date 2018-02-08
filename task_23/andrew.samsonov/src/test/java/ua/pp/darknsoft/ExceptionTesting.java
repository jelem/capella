package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ua.pp.darknsoft.exception.SeatIsBusyCheckedException;
import ua.pp.darknsoft.exception.SeatIsBusyUnCheckedException;


public class ExceptionTesting {

  @Test
  public void checkedTest() throws SeatIsBusyCheckedException {
    RailwayCarriage[] train = new RailwayCarriage[10];
    for (int i = 0; i < train.length; i++) {
      train[i] = new RailwayCarriage();
    }
    try {
      train[1].setPersonChecked(1, new Person("Alex", "Drowber", 12));
      train[1].setPersonChecked(1, new Person("John", "Wayne", 45));
    } catch (SeatIsBusyCheckedException ex) {
      assertThat(ex.getMessage(), is("Checked! Seat Is Busy"));
    }
  }

  @Test
  public void unCheckedTest() throws SeatIsBusyCheckedException {
    RailwayCarriage[] train = new RailwayCarriage[10];
    for (int i = 0; i < train.length; i++) {
      train[i] = new RailwayCarriage();
    }
    try {
      train[1].setPersonChecked(1, new Person("Alex", "Drowber", 12));
      train[2].setPersonChecked(1, new Person("John", "Wayne", 45));
    } catch (SeatIsBusyUnCheckedException ex) {
      assertThat(ex.getMessage(), is("UnChecked! Seat Is Busy"));

    }
  }


}
