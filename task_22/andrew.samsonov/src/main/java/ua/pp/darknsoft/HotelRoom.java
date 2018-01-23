package ua.pp.darknsoft;

public class HotelRoom {

  private int number;
  private TypeRoom typeRoom = TypeRoom.Standart;

  public HotelRoom(int number) {
    this.number = number;
  }

  public HotelRoom(int number, TypeRoom typeRoom) {
    this.number = number;
    this.typeRoom = typeRoom;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof HotelRoom)) {
      return false;
    }

    HotelRoom hotelRoom = (HotelRoom) obj;

    if (number != hotelRoom.number) {
      return false;
    }
    return typeRoom == hotelRoom.typeRoom;
  }

  @Override
  public int hashCode() {
    int result = number;
    result = 31 * result + (typeRoom != null ? typeRoom.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "HotelRoom{" + "number=" + number + ", typeRoom=" + typeRoom + '}';
  }
}
