package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int X = 0, Y = 1, Z = 2;

        System.out.print("Введите размер массива: ");
        int l = scanner.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < l; i++) {
            switch (arr[i]) {
                case X:
                case Y:
                case Z:
                    System.out.println("Данное значение имеется в константах");
                    break;
            }
        }
    }
}
