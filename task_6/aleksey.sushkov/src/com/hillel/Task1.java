package com.hillel;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String... args) {
		
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter the " + i + " element: ");
			int el = scanner.nextInt();
			arr[i-1] = el;
		}
		System.out.print("The first five elements of your massive are ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
