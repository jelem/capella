package com.hillel;

import java.util.Scanner;

public class Task {
  
  public static void main(String... args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter length: ");
    
    int arrayLength = scan.nextInt();
    
    int[] array = new int[arrayLength];
    
    for(int i = 0; i < array.length; i++) {
      System.out.print("Enter element #" + i + " : ");
      array[i] = scan.nextInt();
    }        
  }
}