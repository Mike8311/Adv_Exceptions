package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Количество строк: ");
        int l = scanner.nextInt();

        String[] arr = new String[l];
        for (int i = 0; i < l; i++) {
            System.out.printf( "Строка %d: ", i + 1);
            arr[i] = scanner.next();
        }

        int max = 0;
        int maxI = -1;
        for (int i = 0; i < l; i++) {
            String distinct = arr[i];
            for (int j = 0; j < distinct.length(); j++) {
                distinct = distinct.substring(0, j + 1) +
                    distinct.substring( j + 1 ).replaceAll( distinct.substring( j, j + 1 ), "" );
            }

            if (distinct.length() > max) {
                max = distinct.length();
                maxI = i;
            }
            else if (max == distinct.length()) {
                if (maxI == -1)
                    maxI = i;
            }
        }

        System.out.println("Ответ: " + arr[maxI]);
    }
}
