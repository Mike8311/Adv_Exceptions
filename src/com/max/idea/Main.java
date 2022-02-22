package com.max.idea;

import com.max.idea.staff.Candy;
import com.max.idea.staff.Jellybean;
import com.max.idea.staff.Staff;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Введите номер задания (1 - массив, 2 - сладкий подарок): " );
        int taskNum = scanner.nextInt();

        switch (taskNum) {
            case 1:
                intArray( scanner );
                break;
            case 2:
                sweetPresent();
                break;
            default:
                System.out.println( "Номер задания должен быть числом 1 или 2" );
        }

        scanner.close();
    }

    /**
     * Поиск максимального отрицательного и минимального положительного элемента массива
     *
     * @param scanner сканнер для чтения чисел
     */
    private static void intArray(Scanner scanner) {
        int[] arr = new int[20];
        Random random = new Random();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxI = -1, minI = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) - 10;
            if (arr[i] < 0 && arr[i] > max) {
                max = arr[i];
                maxI = i;
            }
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
                minI = i;
            }
        }

        int temp = arr[maxI];
        arr[maxI] = arr[minI];
        arr[minI] = temp;
    }

    /**
     * Формирование сладкого подарка
     */
    private static void sweetPresent() {
        Candy candy1 = new Candy( "Мишка на севере", 1.1, 3.5, 1 );
        Candy candy2 = new Candy( "Меллер", 1.5, 0.5, 2 );
        Jellybean jellybean1 = new Jellybean( "Fruittella", 2, 0.5, "Красный" );
        Jellybean jellybean2 = new Jellybean( "Бон Пари", 2.5, 0.3, "Зеленый" );

        Staff[] box = { candy1, candy2, jellybean1, jellybean2 };
        double sumWeigth = 0, sumPrice = 0;
        System.out.println("Сладости в подарке: ");
        for (Staff stuff : box) {
            sumWeigth += stuff.getWeight();
            sumPrice += stuff.getPrice();
            System.out.println(stuff);
        }
        System.out.println("Oбщий вес подарка: " + sumWeigth);
        System.out.println("Oбщая стоимость подарка: " + sumPrice);
    }
}

