package com.hillel;

import java.util.Scanner;

public class Task3 {
	
  public static void main(String... args) {
		
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of your array: ");
    int n = scanner.nextInt();
    int arr[] = new int[n];
    System.out.print("Your array: ");
    for (int i = 0, j = n; i < n && j > 0; i++, j--) {
      arr[i] = j;
      System.out.print(arr[i] + " ");
    }
  }
}
