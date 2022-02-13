package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Ввод: ");
        String u = scanner.nextLine();

        int x = u.indexOf( 'x' );
        int o = u.charAt( 1 ) == '+' ? 1 : -1;
        int a = Character.getNumericValue( u.charAt( 0 ) );
        int b = Character.getNumericValue( u.charAt( 2 ) );
        int c = Character.getNumericValue( u.charAt( 4 ) );

        switch (x) {
            case 0:
                System.out.println( "Вывод: " + (c - b * o) );
                break;
            case 2:
                System.out.println( "Вывод: " + (c - a) * o );
                break;
            case 4:
                System.out.println( "Вывод: " + (a + b * o) );
                break;
        }
    }
}
