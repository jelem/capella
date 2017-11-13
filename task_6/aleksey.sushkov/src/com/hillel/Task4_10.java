package com.hillel;

import java.util.Scanner;

public class Task4_10 {
	
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.print("\nElements that divide by 3: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("\nEven elements: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		double sum = 0;
		System.out.print("\nSum of elements: ");
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print(sum);

		System.out.print("\nAverage of elements: " + sum/(arr.length));
		
		System.out.print("\nSum of max and min: ");
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		 int summ = max + min;
		System.out.print(summ);
		
		System.out.print("\nMultiplication of uneven elements: ");
		int unsum = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				unsum *= arr[i];
			}
		}
		System.out.print(unsum);
		
		int counter = 0;
		System.out.print("\nIndex of element, which value is " + arr.length + ": ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == arr.length) {
				System.out.print(i);
				counter ++;
			}
		}
		if(counter == 0) {
			System.out.print("no such elements in your array");
		}
		System.out.println();
	}
}
