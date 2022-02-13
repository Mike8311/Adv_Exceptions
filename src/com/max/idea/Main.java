package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int r = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int c = scanner.nextInt();

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Введите элемент матрицы: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.println("Элемент * 3 равно: " + mat[0][i] * 3);
        }
    }
}
