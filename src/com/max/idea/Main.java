package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int X = 0, Y = 1, Z = 2;

        System.out.print("Введите размер массива: ");
        int l = scanner.nextInt();
        double[] arr = new double[l];

        double s = 0;
        for (int i = 0; i < l; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextDouble();
            s += arr[i];
        }
        s = s / l;

        for (int i = 0; i < l; i++) {
            System.out.println("Элемент * Среднее арифметическое равно: " + arr[i] * s);
        }
    }
}
