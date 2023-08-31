package ru.academits.java;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int sumOfOddDigits = 0;
        int maxDigit = 0;

        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;

            if (digit % 2 != 0) {
                sumOfOddDigits += digit;
            }
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            tempNumber /= 10;
        }

        System.out.println("Сумма цифр числа: " + sumOfDigits);
        System.out.println("Сумма нечетных цифр числа: " + sumOfOddDigits);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }
}