package com.hillel;

public class Task7 {

    public static void main(String... args) {
    }

    public static int addDigits(int number) {
        String stringNumber = String.valueOf(number);
        char[] arrayNumber = stringNumber.toCharArray();
        int totalSum = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            totalSum += Integer.parseInt(String.valueOf(arrayNumber[i]));
        }
        return totalSum;
    }

    public static int numberFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i < number + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int triangleCalculation(int side, String formula) {
        if (formula.equals("perimeter")) {
            return side * 4;
        }

        if (formula.equals("square")) {
            return side * side;
        } else {
            return 0;
        }
    }
}
