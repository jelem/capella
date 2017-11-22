package com.dima;

import com.dima.Triangle.PascalTriangle;

import java.util.Scanner;

public class MainApp {

  public static void main(String[] args) {
    System.out.printf("\t...Welcome to pointer of Pascal Trianle\n" +
        "\t\t...Input its size: ");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    PascalTriangle pascalTriangle = new PascalTriangle(size);
    pascalTriangle.show();
  }
}
