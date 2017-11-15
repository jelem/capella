package com.hillel;
import java.util.Scanner;

public class HomeworkForLesson5{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two-dimensional array length: ");
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();
        
        int[][] array = new int[length1][length2];
        
        System.out.println();
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print("Enter to \"" + i + "\" row \"" 
                                 + j + "\" element: ");
                array[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < array.length; i++){
            System.out.print(i + " row: ");
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}