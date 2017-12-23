package com.dima;

public class FabricPlayer {
  public static Player Human(char ch) {
    return new Human(ch);
  }

  public static Player Easy(char ch) {
    return new EasyComputer(ch);
  }

  public static Player Middle(char ch) {
    return new MiddleComputer(ch);
  }
}
