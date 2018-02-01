package com.hillel.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Information {

  private Room room;
  private Date date;

  public Information(Room room) {
    this.room = room;
    this.date = Calendar.getInstance().getTime();
  }

  public Room getRoom() {
    return room;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Information that = (Information) object;
    return Objects.equals(room, that.room) &&
        Objects.equals(date, that.date);
  }

  @Override
  public int hashCode() {

    return Objects.hash(room, date);
  }

  @Override
  public String toString() {
    return "Information{"
        + "room=" + room
        + ", date=" + date
        + '}';
  }
}
