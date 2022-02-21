package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Введите дробное число: ");
        double d1 = scanner.nextDouble();

        System.out.print( "И еще одно: ");
        double d2 = scanner.nextDouble();

        System.out.print( "Введите операцию (+,-,/,*): ");
        String op = scanner.next();

        switch (op) {
            // Сложение
            case "+":
                System.out.printf( "Сумма двух чисел: %.4f", sum(d1, d2) );
                break;

            // Вычитание
            case "-":
                System.out.printf( "Разница двух чисел: %.4f", sub(d1, d2) );
                break;

            // Деление
            case "/":
                System.out.printf( "Результат деления двух чисел: %.4f", div(d1, d2) );
                break;

            // Умножение
            case "*":
                System.out.printf( "Произведение двух чисел: %.4f", mul(d1, d2) );
                break;
        }
    }

    /**
     * Сложение двух дробных чисел
     * @param d1 первое число
     * @param d2 второне число
     * @return сумма двух чисел
     */
    public static double sum(double d1, double d2)
    {
        return d1 + d2;
    }

    /**
     * Вычитание двух дробных чисел
     * @param d1 первое число
     * @param d2 второне число
     * @return разница двух чисел
     */
    public static double sub(double d1, double d2)
    {
        return d1 - d2;
    }

    /**
     * Деление двух дробных чисел
     * @param d1 первое число
     * @param d2 второне число
     * @return результат деления двух чисел
     */
    public static double div(double d1, double d2)
    {
        return d1 / d2;
    }

    /**
     * Умножение двух дробных чисел
     * @param d1 первое число
     * @param d2 второне число
     * @return произведение двух чисел
     */
    public static double mul(double d1, double d2)
    {
        return d1 * d2;
    }

}
