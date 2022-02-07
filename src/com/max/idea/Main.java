package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        int y = scanner.nextInt();
        System.out.print("Введите число z: ");
        int z = scanner.nextInt();

        int avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел x, y, z = " + avg);

        if (avg / 2 > 3)
            System.out.println("Программа выполнена корректно");
    }
}
