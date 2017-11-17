package com.java;

public class Factorial {

	public static int factorial(int number) {
		int f = 1;			//т.к. факториал нуля равен единице
		for (int i = 1; i <= number; i++) {
			f *= i;
		}
		return f;
	}
}
