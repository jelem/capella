package com;

import java.util.Scanner;

public class ArrayInput {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ввод двумерного массива(симметричного/несимметричного)");
        System.out.print("Введите кол-во строк: ");
        int row = scanner.nextInt();
        
        System.out.println();
        
        int[][] array = new int[row][];
        
        for (int i = 0; i < array.length; i++) {
                        
            System.out.print("Введите кол-во элементов " + i + " строки: ");
            int col = scanner.nextInt();           
            
            array[i] = new int [col];
            
            for (int j = 0; j < array[i].length; j++) {
                                
                System.out.print("Введите элемент [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt(); 
                //System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Вы ввели следующий двумерный массив");
        ArrayPrint(array);
    }
    
    static void ArrayPrint(int[][] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               System.out.print(array[i][j] + " "); 
            }
            System.out.println();
        }
    }
}