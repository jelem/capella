package com.hillel.task1;

import java.util.Objects;

public class Room {

  private int num;
  private RoomType type;
  private RoomAvailability availability;

  public Room(int num, RoomType type) {
    this.num = num;
    this.type = type;
    this.availability = RoomAvailability.AVAILABLE;
  }

  public int getNum() {
    return num;
  }

  public RoomType getType() {
    return type;
  }

  public RoomAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(RoomAvailability availability) {
    this.availability = availability;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Room room = (Room) object;
    return num == room.num;
  }

  @Override
  public int hashCode() {

    return Objects.hash(num);
  }

  @Override
  public String toString() {
    return "Room{"
        + "num=" + num
        + ", type=" + type
        + ", availability=" + availability
        + '}';
  }

  public boolean isAvailable() {
    return availability == RoomAvailability.AVAILABLE;
  }
}
