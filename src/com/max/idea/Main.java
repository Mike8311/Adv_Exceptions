package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";

        System.out.println( "Отгдай загадку: " + question);

        for (int i = 1; i <= 3; i++) {
            System.out.println( "Введи ответ: " );
            String s = scanner.nextLine();
            if (s.equals( "Подсказка" )) {
                if (i == 1) {
                    System.out.println( "Подсказка: Заархивированный ..." );
                } else
                    System.out.println( "Подсказка уже недоступна" );
                System.out.println( "Введи ответ: " );
                s = scanner.nextLine();
                if (!s.equals( answer ) && i == 1)
                    break;
            }

            if (s.equals( answer ))
            {
                System.out.println( "Правильно!" );
                return;
            }
            else if (i < 3)
                System.out.println( "Подумай еще!" );
        }

        System.out.println( "Обидно, приходи в другой раз" );
    }
}
