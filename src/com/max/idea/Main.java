package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String s = scanner.next();
        System.out.print("Введите второе число: ");
        int i = scanner.nextInt();

        System.out.println("Большее число: " + Math.max(Integer.parseInt(s), i));
        System.out.println("Меньшее число: " + (double)Math.min(Integer.parseInt(s), i));
    }
}
