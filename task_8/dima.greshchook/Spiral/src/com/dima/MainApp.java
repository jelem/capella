package com.dima;

import com.dima.spiral.Spiral;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    System.out.printf("\t...Welcome to builder of Spiral Array\n" +
        "\t\t...Input its size: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    Spiral spiral = new Spiral(size);
    spiral.show();
  }
}
