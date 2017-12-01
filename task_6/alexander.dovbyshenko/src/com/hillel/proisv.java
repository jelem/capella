package com.hillel;

public class proisv{

  public static void main(String... args){
      
    int[] array = {4,5,6,12,4,-3,6,7,8,123}; 
    int res = 1;  
    for(int i = 0; i < array.length; i++){
        
      if(array[i] % 3 == 0){  
        res *= array[i];  
        System.out.println(array[i] + " ");
      }
       
    }
      System.out.println("Result = " + res);
  }    
    
}