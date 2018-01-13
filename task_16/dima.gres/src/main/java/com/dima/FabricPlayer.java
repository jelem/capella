package com.dima;

public class FabricPlayer {
  public static Player human(char ch) {
    return new Human(ch);
  }

  public static Player easy(char ch) {
    return new EasyComputer(ch);
  }

  public static Player middle(char ch) {
    return new MiddleComputer(ch);
  }
}
