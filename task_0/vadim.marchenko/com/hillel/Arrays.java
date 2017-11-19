package com.hillel;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("Создан массив : ");
        printArrayFull();
        addArrayElements();
        arrayMinMax();
        arrayOddEvenSumm();
    }

    public static int[] createArray() {
        int[] numbersArray = new int[10];
        int number = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = number += 5;
        }
        return numbersArray;
    }

    public static void printArrayFull() {
        for (int i = 0; i < createArray().length; i++) {
            System.out.println(createArray()[i]);
        }
    }

    public static void addArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов массива Вы хотите сложить ?");
        int numberOfElements = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < numberOfElements; i++) {
            result += createArray()[i];
        }
        System.out.println("Сумма " + numberOfElements + " элеметнов массива равняется " + result);
    }

    public static void arrayMinMax() {
        int arrayMin = createArray()[0];
        int arrayMax = createArray()[0];
        for (int i = 0; i < createArray().length; i++) {
            if (arrayMin > createArray()[i]) {
                    arrayMin = createArray()[i];
            }
            if (arrayMax < createArray()[i]) {
                    arrayMax = createArray()[i];
            }
        }
        System.out.println("Минимальный элемент этого массива : " + arrayMin);
        System.out.println("Максимальный элемент этого массива : " + arrayMax);
    }

    public static void arrayOddEvenSumm() {
        int oddSumm = 0;
        int evenSumm = 0;
        for (int i = 0; i < createArray().length; i++) {
            if (createArray()[i] % 2 != 0) {
                oddSumm += createArray()[i];
            }
            if (createArray()[i] % 2 == 0) {
                evenSumm += createArray()[i];
            }
        }
        System.out.println("Сумма нечетных элементов этого массива равна : " + oddSumm);
        System.out.println("Сумма четных элементов этого массива равна : " + evenSumm);
    }
}
