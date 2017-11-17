package com.hillel;

import java.util.Scanner;

public class ArrayConsole{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do{
            System.out.print("Enter N elements of array(>1): ");
            n = scanner.nextInt();
        }while(n < 2);

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element # " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Your array: ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}