package com.java;

public class SumOfNumbers {

	public static int sum(int numbers) {
		int sum = 0;
		while (numbers > 0) {
			int num = numbers % 10;
			sum += num;
			numbers = numbers / 10;
		}
		return sum;
	}
}
