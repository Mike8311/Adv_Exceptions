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
        System.out.print("Введите символ (+ - * /): ");
        String symbol = scanner.next();

        int z = 0;
        switch (symbol) {
            case "+":
              z = x + y;
              break;
            case "-":
                z = x - y;
                break;
            case "*":
                z = x * y;
                break;
            case "/":
                z = x / y;
                break;
            default:
                System.out.println("Вы ввели недопустимый символ!");
        }
        System.out.printf("Результ выполнения операции %d %s %d = %d ", x, symbol, y, z);
    }
}
