package com.hillel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstInteger = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondInteger = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int thirdInteger = scanner.nextInt();

        System.out.println("Минимальное число: " + getMinimal(firstInteger, secondInteger, thirdInteger));
        System.out.println("Максимальное число: " + getMaximal(firstInteger, secondInteger, thirdInteger));

        if (isEven(firstInteger)) {
            System.out.println(firstInteger + " Является четным");
        } else {
            System.out.println(firstInteger + " Является нечетным");

        }

        if (moduloOperation(firstInteger, secondInteger)) {
            System.out.println(firstInteger + " делится на " + secondInteger);
        } else {
            System.out.println(firstInteger + " не делится на " + secondInteger);
        }

        System.out.println(closestToTen(firstInteger, secondInteger) + " является ближайшим к 10");
    }

    public static int getMinimal(int firstInteger, int secondInteger, int thirdInteger) {
        int returnedValue = firstInteger < secondInteger ? firstInteger : secondInteger;
        returnedValue = returnedValue < thirdInteger ? returnedValue : thirdInteger;
        return returnedValue;
    }

    public static int getMaximal(int firstInteger, int secondInteger, int thirdInteger) {
        int returnedValue = firstInteger > secondInteger ? firstInteger : secondInteger;
        returnedValue = returnedValue > thirdInteger ? returnedValue : thirdInteger;
        return returnedValue;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static boolean moduloOperation(int firstInteger, int secondInteger) {
        return (firstInteger % secondInteger == 0);
    }

    public static int closestToTen(int firstInteger, int secondInteger) {
        int firstProcessedInteger = firstInteger - 10;
        int secondProcessedInteger = secondInteger - 10;
        firstProcessedInteger = Math.abs(firstProcessedInteger);
        secondProcessedInteger = Math.abs(secondProcessedInteger);

        return firstProcessedInteger < secondProcessedInteger ? firstInteger : secondInteger;
    }
}
