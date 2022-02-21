package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Введите номер задания (1 - калькулятор, 2 - массив строк): " );
        int taskNum = scanner.nextInt();

        switch (taskNum) {
            case 1:
                calculator( scanner );
                break;
            case 2:
                stringArray( scanner );
                break;
            default:
                System.out.println( "Номер задания должен быть числом 1 или 2" );
        }

        scanner.close();
    }

    /**
     * Поиск самого длинного слоова в массиве
     *
     * @param scanner сканнер для чтения чисел
     */
    private static void stringArray(Scanner scanner) {
        System.out.print( "Введите размер массива слов: " );
        String[] arr = new String[scanner.nextInt()];

        int max = 0;
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf( "Введите слово %d: ", i + 1 );
            arr[i] = scanner.next();

            if (arr[i].length() > max) {
                max = arr[i].length();
                j = i;
            }
        }

        System.out.print( "Самое длинное слово: " + arr[j] );
    }

    /**
     * Калькулятор двух чисел
     *
     * @param scanner сканнер для чтения чисел
     */
    private static void calculator(Scanner scanner) {
        System.out.print( "Введите дробное число: " );
        double d1 = scanner.nextDouble();

        System.out.print( "И еще одно: " );
        double d2 = scanner.nextDouble();

        System.out.print( "Введите операцию (+,-,/,*): " );
        String op = scanner.next();

        switch (op) {
            // Сложение
            case "+":
                System.out.printf( "Сумма двух чисел: %.4f", sum( d1, d2 ) );
                break;

            // Вычитание
            case "-":
                System.out.printf( "Разница двух чисел: %.4f", sub( d1, d2 ) );
                break;

            // Деление
            case "/":
                System.out.printf( "Результат деления двух чисел: %.4f", div( d1, d2 ) );
                break;

            // Умножение
            case "*":
                System.out.printf( "Произведение двух чисел: %.4f", mul( d1, d2 ) );
                break;
        }
    }

    /**
     * Сложение двух дробных чисел
     *
     * @param d1 первое число
     * @param d2 второне число
     * @return сумма двух чисел
     */
    private static double sum(double d1, double d2) {
        return d1 + d2;
    }

    /**
     * Вычитание двух дробных чисел
     *
     * @param d1 первое число
     * @param d2 второне число
     * @return разница двух чисел
     */
    private static double sub(double d1, double d2) {
        return d1 - d2;
    }

    /**
     * Деление двух дробных чисел
     *
     * @param d1 первое число
     * @param d2 второне число
     * @return результат деления двух чисел
     */
    private static double div(double d1, double d2) {
        return d1 / d2;
    }

    /**
     * Умножение двух дробных чисел
     *
     * @param d1 первое число
     * @param d2 второне число
     * @return произведение двух чисел
     */
    private static double mul(double d1, double d2) {
        return d1 * d2;
    }
}

