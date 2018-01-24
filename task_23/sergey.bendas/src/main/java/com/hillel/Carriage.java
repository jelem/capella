package com.hillel;

import java.util.HashSet;

public class Carriage {

  private int number;
  private int numberOfPlaces;
  private HashSet<Place> places;

  public Carriage(int carriageNumber, int numberOfPlaces) {
    this.number = carriageNumber;
    this.numberOfPlaces = numberOfPlaces;
    places = new HashSet<>(numberOfPlaces);
    for (int i = 0; i < numberOfPlaces; i++) {
      places.add(new Place(carriageNumber, i));
    }
  }

  public int length() {
    return places.size();
  }

  public Place getPlace() {
    if (places.isEmpty()) {
      throw new NoPlacesException();
    }
    Place place = places.iterator()
        .next();
    places.remove(place);
    return place;
  }

  public Place getPlace(int placeNumber) throws NoSuchPlaceException {
    if (placeNumber < 0) {
      throw new WrongPlaceException();
    }
    if (places.isEmpty()) {
      throw new NoPlacesException();
    }
    if (placeNumber >= length()) {
      throw new NoSuchPlaceException("This carriage has just " + numberOfPlaces + " places");
    }
    Place place = new Place(this.number, placeNumber);
    if (!places.remove(place)) {
      throw new NoSuchPlaceException("Such place is not available");
    }
    return place;
  }

  public boolean hasPlaces() {
    return !(places.isEmpty());
  }

  @Override
  public String toString() {
    return "Carriage{"
        + "places=" + places
        + '}';
  }
}
