package com.hillel;

import java.util.Scanner;

public class Task {
  
  public static void main(String... args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter length: ");
    
    int arrayLength = scan.nextInt();
    
    System.out.print("Enter width: ");
    
    int arrayWidth = scan.nextInt();
    
    int[][] array = new int[arrayLength][arrayWidth];
    
    for(int i = 0; i < array.length; i++) {
      
      for(int j = 0; j < array[i].length; j++) {
        
        System.out.print("Enter element at (" + i + "; " + j + ") : ");
        array[i][j] = scan.nextInt();
      }
    }        
  }
}