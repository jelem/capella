package com.hillel;

import java.util.Scanner;

public class arrayFrom1toN{
    
  public static void main(String... args){
      
    Scanner scanner = new Scanner(System.in);    
      
    System.out.println("Length of array =  ");
    int length = scanner.nextInt();   
      
    int[] array = new int[length];   
      
    for(int i = 0; i < array.length; i++){
        
      array[i] = i + 1;  
        
    }
      
    System.out.println("Array: ");
    for(int i = 0; i < array.length; i++){
        
      System.out.print(array[i] + " ");    
        
    }  
     System.out.println(); 
  }    
    
}