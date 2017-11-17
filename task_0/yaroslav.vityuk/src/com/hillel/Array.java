package com.hillel;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Vvedite massiv: ");
        for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
        }
        System.out.print ("Massiv: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        
    }
}