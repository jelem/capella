package com.hillel;

import java.util.ArrayList;

public class Train {

  private ArrayList<Carriage> carriages;

  private Train(Builder builder) {
    this.carriages = builder.carriages;
  }

  public static class Builder {

    private ArrayList<Carriage> carriages;

    public Builder() {
      carriages = new ArrayList<>();
    }

    public Builder carriage(int numberOfPlaces) {
      carriages.add(new Carriage(carriages.size(), numberOfPlaces));
      return this;
    }

    public Train build() {
      return new Train(this);
    }
  }

  public int length() {
    return carriages.size();
  }

  public Place getPlace() {
    for (Carriage carriage : carriages) {
      if (carriage.hasPlaces()) {
        return carriage.getPlace();
      }
    }
    throw new NoPlacesException();
  }

  public Place getPlace(int carriage, int place) throws NoSuchPlaceException {
    if (carriage < 0) {
      throw new WrongPlaceException();
    }
    if (carriage >= carriages.size()) {
      throw new NoSuchPlaceException("This train has just " + carriages.size() + " carriages");
    }
    return carriages.get(carriage).getPlace(place);
  }

  public boolean hasPlaces() {
    for (Carriage carriage : carriages) {
      if (carriage.hasPlaces()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Train{"
        + "carriages=" + carriages
        + '}';
  }
}
