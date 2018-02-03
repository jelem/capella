package ua.pp.darknsoft;


import ua.pp.darknsoft.exception.SeatIsBusyCheckedException;
import ua.pp.darknsoft.exception.SeatIsBusyUnCheckedException;

import java.util.Arrays;

public class RailwayCarriage {

  private static final int SEAT_NUMBER = 36;
  private Person[] carriage;

  public RailwayCarriage() {
    this.carriage = new Person[SEAT_NUMBER];
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof RailwayCarriage)) {
      return false;
    }

    RailwayCarriage that = (RailwayCarriage) obj;

    return Arrays.equals(carriage, that.carriage);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(carriage);
  }

  public void setPersonChecked(int seatNumber, Person person) throws SeatIsBusyCheckedException {
    if (this.carriage[seatNumber] != null) {
      throw new SeatIsBusyCheckedException("Checked! Seat Is Busy");
    }
    this.carriage[seatNumber] = person;
  }

  public void setPersonUnChecked(int seatNumber, Person person) {
    if (this.carriage[seatNumber] != null) {
      throw new SeatIsBusyUnCheckedException("UnChecked! Seat Is Busy");
    }
    this.carriage[seatNumber] = person;
  }

  @Override
  public String toString() {
    return "RailwayCarriage{" + "carriage=" + Arrays.toString(carriage) + '}';
  }
}
