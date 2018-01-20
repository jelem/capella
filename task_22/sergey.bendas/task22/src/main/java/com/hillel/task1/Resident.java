package com.hillel.task1;

import com.hillel.task1.Hotel;
import com.hillel.task1.Human;

public class Resident extends Human {


  public Resident(String firstName, String lastName, int age) {
    super(firstName, lastName, age);
  }

  @Override
  public int hashCode() {
    char firstLetter = getLastName().charAt(0);
    if (firstLetter < 'A' || firstLetter > 'Z') {
      return -1;
    }
    return firstLetter - 'A';
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  public void leaveHotel(Hotel hotel) {
    hotel.leaveHotel(this);
  }
}
