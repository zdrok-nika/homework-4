package ru.academits.java;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();

        System.out.print("Введите число d: ");
        double d = scanner.nextDouble();

        System.out.println((a+b+c+d) / 4);
    }
}
