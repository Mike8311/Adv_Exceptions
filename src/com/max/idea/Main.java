package com.max.idea;

import com.max.idea.operations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        calculator( scanner );

        scanner.close();
    }

    /**
     * Калькулятор двух дробных чисел
     *
     * @param scanner сканнер для чтения чисел
     */
    private static void calculator(Scanner scanner) {
        System.out.print( "Введите дробное число: " );
        double d1 = scanner.nextDouble();

        System.out.print( "И еще одно: " );
        double d2 = scanner.nextDouble();

        System.out.print( "Введите операцию калькулятора (+,-,/,*): " );
        String op = scanner.next();

        Operation operation;
        switch (op) {
            // Сложение
            case "+":
                operation = new Addition();
                break;
            // Вычитание
            case "-":
                operation = new Subtraction();
                break;
            // Деление
            case "/":
                operation = new Division();
                break;
            // Умножение
            case "*":
                operation = new Multiplication();
                break;
            default:
                System.out.printf( "Операция неверно введена: %s %n", op );
                return;
        }

        System.out.printf( "Выбрана %s %n", operation );
        System.out.printf( "Результат вычисления: %.4f %n", operation.Calculate( d1, d2 ) );
    }
}

