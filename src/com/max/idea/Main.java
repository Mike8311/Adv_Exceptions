package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите что переводить (0 - масса, 1 - расстояние): ");
        int x = scanner.nextInt();
        int y;
        if (x == 0) {
            System.out.print( "Выберите единицу измерения (0 - килограмм, 1 - карат, 2 - унция, 3 - фунт): " );
            y = scanner.nextInt();
            if (y < 0 || y > 3) {
                System.out.println( "Вы ввели неверное число!" );
                return;
            }
        }
        else if (x == 1) {
            System.out.print( "Выберите единицу измерения (0 - метр, 1 - миля, 2 - ярд, 3 - фут): " );
            y = scanner.nextInt();
            if (y < 0 || y > 3) {
                System.out.println( "Вы ввели неверное число!" );
                return;
            }
        }
        else
        {
            System.out.println("Вы ввели неверное число!");
            return;
        }

        System.out.print("Введите количество выбранных единиц: ");
        int z = scanner.nextInt();

        String[] weightNames = {"Килограмм", "Карат", "Унция", "Фунт"};
        double[] weights = {1, 5000, 35.27396194958048, 2.2046226218488};

        String[] lenNames = {"Метры", "Мили", "Ярды", "Футы"};
        double[] lens = {1, 0.000621371192237334, 1.0936132983, 3.2808398950131};

        String[] dimNames = x == 0 ? weightNames : lenNames;
        double[] dims = x == 0 ? weights : lens;

        System.out.println("Результат:");
        for (int i = 0; i < dims.length; i++)
            System.out.printf("%s: %.3f%n", dimNames[i], z / dims[y]  * dims[i]);
    }
}
