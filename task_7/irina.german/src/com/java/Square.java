package com.java;

public class Square {

 public static int squareCalculation(int side, String formula) {
	int result;

	if (formula.equals("perimeter")) {
	 result = side * 4;
	} else if (formula.equals("square")) {
	 result = side * side;
	} else {
	 result = 0;
	}
	return result;
 }
}


