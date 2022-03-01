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
                String message = String.format( "Операция неверно введена: %s %n", op );
                System.out.println( message );
                throw new InvalidInputOperation( message );
        }

        System.out.printf( "Выбрана %s %n", operation );
        try {
            // Операцию деления проводим отдельно с помощью целых чисел, чтобы получить исключение, а не Infinity
            if (operation instanceof Division && d2 == 0) {
                int res = (int) d1 / (int) d2;
            }

            System.out.printf( "Результат вычисления: %.4f %n", operation.Calculate( d1, d2 ) );
        } catch (ArithmeticException e) {
            if (operation instanceof Division) {
                System.out.println( "Невозможно раздлелить на 0" );
                throw e;
            }
        }
    }
}
