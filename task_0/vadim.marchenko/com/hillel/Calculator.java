package com.hillel;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        System.out.println("1. Сложение ");
        System.out.println("2. Вычитание ");
        System.out.println("3. Умножение ");
        System.out.println("4. Деление ");
        int stringOperation = scanner.nextInt();
        System.out.println("Введите первое число: ");
        int firstOperand = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondOperand = scanner.nextInt();

        if (stringOperation == 1) {
            System.out.println(additionResult(firstOperand, secondOperand));
        }
        if (stringOperation == 2) {
            System.out.println(subtractionResult(firstOperand, secondOperand));
        }
        if (stringOperation == 3) {
            System.out.println(multiplyingResult(firstOperand, secondOperand));
        }
        if (stringOperation == 4) {
            System.out.println(divisionResult(firstOperand, secondOperand));
        }

    }

    public static int additionResult(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public static int subtractionResult(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public static int multiplyingResult(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public static int divisionResult(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
