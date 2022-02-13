package com.max.idea;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Курс доллара: ");
        double k = scanner.nextDouble();

        System.out.print( "Количество рублей: ");
        double r = scanner.nextDouble();

        System.out.printf("Итого: %.2f", r / k);
    }
}
