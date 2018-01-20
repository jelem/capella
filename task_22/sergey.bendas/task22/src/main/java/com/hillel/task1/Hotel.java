package com.hillel.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Hotel {

  private String name;
  private HashMap<Resident, Information> bucket;
  private Set<Room> rooms;


  public Hotel(String name) {
    this.name = name;
    this.bucket = new HashMap<>();
    this.rooms = new HashSet<>();
  }

  public HashMap<Resident, Information> getBucket() {
    return bucket;
  }

  public String getName() {
    return name;
  }

  public Set<Room> getRooms() {
    return rooms;
  }

  private Room[] getRoomsArray() {
    Object[] objArray = rooms.toArray();
    Room[] roomArray = new Room[objArray.length];
    for (int i = 0; i < roomArray.length; i++) {
      roomArray[i] = (Room) objArray[i];
    }
    return roomArray;
  }

  public Room room(int num) {
    Room[] rooms = getRoomsArray();
    for (Room room : rooms) {
      if (room.getNum() == num) {
        return room;
      }
    }
    throw new NoSuchElementException();
  }

  public Hotel createRoom(int num, RoomType type) {
    Room room = new Room(num, type);
    rooms.add(room);
    return this;
  }

  public void leaveHotel(Resident resident) {
    if (!bucket.containsKey(resident)) {
      System.out.println("Mr. " + resident.getLastName() + ", you are not our resident");
      return;
    }
    bucket.get(resident).getRoom().setAvailability(RoomAvailability.AVAILABLE);
    bucket.remove(resident);
  }
}
