package ua.pp.darknsoft;

public class HotelGuest implements Comparable {

  private String firstName;
  private String lastName;
  private int age;
  private final int guestHash;


  public HotelGuest(String lastName) {
    this.lastName = lastName;
    this.guestHash = Cell.valueOf(lastName.substring(0, 1).toUpperCase()).hashCode();
  }

  public HotelGuest(String firstName, String lastName) {
    this(lastName);
    this.firstName = firstName;
  }

  public HotelGuest(String firstName, String lastName, int age) {
    this(lastName, firstName);
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    HotelGuest that = (HotelGuest) obj;

    if (age != that.age) {
      return false;
    }
    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) {
      return false;
    }
    return lastName.equals(that.lastName);
  }

  @Override
  public int hashCode() {
    return guestHash;
  }

  @Override
  public String toString() {
    String print = "";
    if (firstName == null) {
      return lastName;
    } else {
      return firstName + " " + lastName;
    }
  }

  @Override
  public int compareTo(Object obj) {
    return this.lastName.compareTo(((HotelGuest) obj).lastName);
  }
}
