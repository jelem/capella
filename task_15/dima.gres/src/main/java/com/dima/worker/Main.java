package com.dima.worker;

public class Main {

  public static void main(String[] args) {
    Worker[] theCompany =  {
      new GuildMaister(),
      new Welder(),
      new Turner(),
      new Painter(),
      new Turner()
    };

    for ( Worker worker : theCompany) {
      worker.work();
    }
  }
}
