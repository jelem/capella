package com.hillel;

import java.util.Scanner;

public class index{

  public static void main(String... args){
      
    Scanner scanner = new Scanner(System.in); 
      
    int[] array = {4,5,6,12,4,-3,6,7,8,123}; 
    
    System.out.print("Numeral = ");
    int num = scanner.nextInt();
     
    int count = 0;  
    for(int i = 0; i < array.length; i++){
        
      if(num == array[i]){
          
        System.out.println("index is: " + i);     
          
      }else{
          
        System.out.println("There's no element with such index");
        break;
           
      }    
        
    }
      
  }    
    
}