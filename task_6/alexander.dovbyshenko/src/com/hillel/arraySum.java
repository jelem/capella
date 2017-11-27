package com.hillel;

public class arraySum{

  public static void main(String... args){
      
    int[] array = {4,5,6,12,4,-3,6,7,8,123}; 
    int sum = 0;
      
    for(int i = 0; i < array.length; i++){
      sum += array[i];  
    }
      System.out.println(" " + sum);
  }    
    
}