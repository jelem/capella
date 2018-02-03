package com.hillel;

public class Main {

  public static void main(String[] args) {
    Train train = new Train.Builder()
        .carriage(24)
        .carriage(36)
        .build();

    getPlace(train, 1, 2);
    getPlace(train, 1, 2);
    getPlace(train, 3, 2);
    getPlace(train, -1, -1);
    for (int i = 0; i < 58; i++) {
      getPlace(train);
    }
    getPlace(train);
    getPlace(train, 1, 3);
    getPlace(train, 4, 5);
    getPlace(train, -1, 3);

  }

  public static Place getPlace(Train train) {
    if (!train.hasPlaces()) {
      System.out.println("Train has no places");
      return null;
    }
    Place place = train.getPlace();
    System.out.println(place);
    return place;

  }

  public static Place getPlace(Train train, int carriage, int place) {
    if (carriage < 0 || place < 0) {
      System.out.println("Wrong place");
      return null;
    }
    if (!train.hasPlaces()) {
      System.out.println("Train has no places");
      return null;
    }
    try {
      Place place1 = train.getPlace();
      System.out.println(place1);
      return train.getPlace(carriage, place);
    } catch (NoSuchPlaceException exception) {
      System.out.println(exception.getMessage());
    }
    return null;
  }
}
