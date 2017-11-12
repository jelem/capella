package com.hillel;

import java.util.Scanner;

public class Task1 {

  public static void main(String... args) {
    
    System.out.print("Enter first dimension: ");
    Scanner scanner = new Scanner(System.in);
    int dim1 = scanner.nextInt();

    System.out.print("Enter second dimension: ");
    int dim2 = scanner.nextInt();
    
    int array[][] = new int[dim1][dim2];

    for (int i = 0; i < dim1; i++) { 
      for (int j = 0; j < dim2; j++) {
        System.out.print("Element [" + i + "][" + j + "] = ");
        array[i][j] = scanner.nextInt();
      }
    }
    System.out.println("\nYour array is: ");
    for (int i = 0; i < dim1; i++) {
      System.out.println();  
      for (int j = 0; j < dim2; j++) {
        System.out.print(array[i][j] + "\t");
      }
    }
    System.out.println();
  }
}