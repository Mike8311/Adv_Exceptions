package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int x = scanner.nextInt();

        int s = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) s += i;
        }

        System.out.printf("Сумма нечетных чисел равна: %d%n", s);
    }
}
