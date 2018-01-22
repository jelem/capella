package com.hillel.task1;

public class Main {

  public static void main(String[] args) {

    Hotel hotel = new Hotel("Good Hotel");

    Concierge smith = new Concierge("John", "Smith", 45, hotel);
    Concierge charon = new Concierge("Charon", "Reddick", 50, hotel);

    Resident jamesBond = new Resident("James", "Bond", 35);
    Resident maxPaine = new Resident("Max", "Paine", 40);
    Resident laraCroft = new Resident("Lara", "Croft", 25);
    Resident ethanHunt = new Resident("Ethan", "Hunt", 30);
    Resident johnWick = new Resident("John", "Wick", 37);

    hotel.createRoom(1, RoomType.LUX)
        .createRoom(2, RoomType.DUPLEX)
        .createRoom(3, RoomType.STANDARD)
        .createRoom(4, RoomType.STANDARD)
        .createRoom(5, RoomType.SUITE)
        .createRoom(6, RoomType.LUX);

    smith.putInBucket(jamesBond, hotel.room(1));
    smith.putInBucket(maxPaine, hotel.room(2));
    smith.putInBucket(maxPaine, hotel.room(4));
    charon.putInBucket(laraCroft, hotel.room(3));
    charon.putInBucket(ethanHunt, hotel.room(2));

    maxPaine.leaveHotel(hotel);
    maxPaine.leaveHotel(hotel);

    smith.putInBucket(johnWick, hotel.room(6));
    charon.putInBucket(jamesBond, hotel.room(5));
    charon.putInBucket(maxPaine, hotel.room(2));

    System.out.println(hotel.getBucket());
    System.out.println(hotel.getRooms());

  }

}
