package com.hillel;

import java.util.Scanner;

public class ServiceTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сумму вашего счета: ");
        int rawBill = scanner.nextInt();
        System.out.println("Оцените уровень сервиса: ");
        System.out.println("1. Ужасно");
        System.out.println("2. Плохо");
        System.out.println("3. Хорошо");
        System.out.println("4. Отлично");
        System.out.println("5. Потрясающе");
        int serviceLevel = scanner.nextInt();

        if (serviceLevel == 2) {
            System.out.println("Сумма чаевых: " + poorService(rawBill) + " единиц денег");
        }
        if (serviceLevel == 3) {
            System.out.println("Сумма чаевых: " + goodService(rawBill) + " единиц денег");
        }
        if (serviceLevel == 4) {
            System.out.println("Сумма чаевых: " + greatService(rawBill) + " единиц денег");
        }
        if (serviceLevel == 5) {
            System.out.println("Сумма чаевых: " + excellentService(rawBill) + " единиц денег");
        }
    }

    public static float poorService(int rawBill) {
        return rawBill * 0.05f;
    }

    public static float goodService(int rawBill) {
        return rawBill * 0.1f;
    }

    public static float greatService(int rawBill) {
        return rawBill * 0.15f;
    }

    public static float excellentService(int rawBill) {
        return rawBill * 0.2f;
    }
}
