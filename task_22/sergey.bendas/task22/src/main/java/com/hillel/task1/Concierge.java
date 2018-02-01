package com.hillel.task1;

public class Concierge extends Human {

  private Hotel hotel;

  public Concierge(String firstName, String lastName, int age, Hotel hotel) {
    super(firstName, lastName, age);
    this.hotel = hotel;
  }

  public void putInBucket(Resident resident, Room room) {
    if (!room.isAvailable()) {
      System.out.println("Room isn't Available");
      return;
    }

    if (hotel.getBucket().containsKey(resident)) {
      hotel.getBucket()
          .get(resident)
          .getRoom()
          .setAvailability(RoomAvailability.AVAILABLE);
    }
    Information information = new Information(room);
    hotel.getBucket()
        .put(resident, information);
    room.setAvailability(RoomAvailability.BUSY);
  }
}
