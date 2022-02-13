package com.max.idea;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        String latin = "qwertyuiopasdfghjklzxcvbnm";

        System.out.print("Введите слова через пробел: ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        int count = 0;
        for (String s : arr) {
            int j = 0;
            String lowerWord = s.toLowerCase();
            for (; j < s.length(); j++) {
                if (!latin.contains( String.valueOf( s.charAt( j ) ).toLowerCase() )) break;
            }
            if (j == s.length()) {
                System.out.println( s );
                count++;
            }
        }

        System.out.println("Количество латинских слов: " + count);
    }
}
