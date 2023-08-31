package ru.academits.java;

public class Cycle {

    public static void main(String[] args) {
        int a = 100;
        for (int i = 1; i <=100; i++) {
            if (a % 4 == 0) {
                System.out.println(a);
                a = a - 1;
            }
            else
                a = a - 1;
       }
    }
}
