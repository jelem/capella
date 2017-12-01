package com.hillel;

public class task4{

  public static void main(String... args){
      
    int[] array = {4,5,6,12,4,-3,6,7,8,123}; 
      
    for(int i = 0; i < array.length; i++){
        
      if(array[i] % 3 == 0){  
        System.out.println(array[i] + " ");
      }
        
    }
      
  }    
    
}