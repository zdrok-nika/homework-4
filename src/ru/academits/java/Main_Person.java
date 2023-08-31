package ru.academits.java;

import java.util.Scanner;

public class Main_Person {

    public static void main(String[] args, int age) {
        Scanner scanner = new Scanner(System.in);
     //   Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt(); // не могу сообразить что тут нужно сделать
    }
}
