package com.hillel;

public class NoSuchPlaceException extends Exception {

  public NoSuchPlaceException(String message) {
    super(message);
  }

  public NoSuchPlaceException() {
  }
}
