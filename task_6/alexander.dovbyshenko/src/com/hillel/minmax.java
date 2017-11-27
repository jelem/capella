package com.hillel;

public class minmax{

  public static void main(String... args){
      
    int[] array = {4,5,6,12,4,-3,6,7,8,123};
    int min = array[0];
    int max = array[0];

    for (int i = 0; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
    }
      
    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    int res = max+min; 
    System.out.println("Sum = " + res);
  }    
    
}