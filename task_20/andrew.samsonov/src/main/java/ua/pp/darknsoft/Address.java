package ua.pp.darknsoft;


import java.util.Comparator;

public class Address implements Comparable<Address> {

  private String country;
  private String state;
  private String city;
  private String street;
  private int houseNumber;
  private int flatNumber;
  private static final Comparator<Address> COMPARATOR = Comparator
      .comparing((Address adr) -> adr.country).thenComparing(adr -> adr.state)
      .thenComparing(adr -> adr.city)
      .thenComparing(adr -> adr.street)
      .thenComparingInt(adr -> adr.houseNumber)
      .thenComparingInt(adr -> adr.flatNumber);


  private Address(Builder builder) {
    this.country = builder.country;
    this.state = builder.state;
    this.city = builder.cityName;
    this.street = builder.street;
    this.houseNumber = builder.houseNumber;
    this.flatNumber = builder.flatNumber;
  }

  public String getCountry() {
    return country;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public int getFlatNumber() {
    return flatNumber;
  }

  public int compareTo(Address address) {

    return COMPARATOR.compare(this, address);
  }

  public static class Builder {

    private String country = "Україна";
    private String state = "Одеська область";
    private final String cityName;
    private String street = "NoName";
    private int houseNumber = 0;
    private int flatNumber = 0;

    public Builder(String cityName) {
      this.cityName = cityName;
    }

    public Builder country(String country) {
      this.country = country;
      return this;
    }

    public Builder state(String state) {
      this.state = state;
      return this;
    }

    public Builder street(String street) {
      this.street = street;
      return this;
    }

    public Builder houseNumber(int houseNumber) {
      this.houseNumber = houseNumber;
      return this;
    }

    public Builder flatNumber(int flatNumber) {
      this.flatNumber = flatNumber;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Address address = (Address) obj;

    if (houseNumber != address.houseNumber) {
      return false;
    }
    if (flatNumber != address.flatNumber) {
      return false;
    }
    if (!country.equals(address.country)) {
      return false;
    }
    if (!state.equals(address.state)) {
      return false;
    }
    if (!city.equals(address.city)) {
      return false;
    }
    return street.equals(address.street);
  }

  @Override
  public int hashCode() {
    int result = country.hashCode();
    result = 31 * result + state.hashCode();
    result = 31 * result + city.hashCode();
    result = 31 * result + street.hashCode();
    result = 31 * result + houseNumber;
    result = 31 * result + flatNumber;
    return result;
  }

  @Override
  public String toString() {
    return "country: " + country + " state: " + state + " city: " + city + " street: " + street
        + " houseN: " + houseNumber + " flatN: " + flatNumber;
  }
}
