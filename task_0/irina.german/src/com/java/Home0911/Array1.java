package com.java.Home0911;

import java.util.Scanner;

public class Array1{
    
    public static void main(String... args){
        
        int[] ar = new int[5];
        
        Scanner skan = new Scanner(System.in);
        
        for (int i = 0; i < ar.length; i++){
        
            ar[i] = skan.nextInt();
        }
    }
}