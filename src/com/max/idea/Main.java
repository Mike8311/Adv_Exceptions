package com.max.idea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner( new File( "Words.txt") );

        Map<String, Integer> result = new WordCounter().Count( scanner );
        int max = 0;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.printf( "Слово: %s Кол-во повторов: %d %n", word, count );
            if (count > max) {
                maxWord = word;
                max = count;
            }
        }
        System.out.printf( "Слово c макс кол-вом повторений: %s Кол-во повторов %d %n", maxWord, max );

        scanner.close();
    }
}

