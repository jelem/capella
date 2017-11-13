package com.hillel;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of your array: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.print("Your array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
}
