package com.max.idea;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(40) - 20;
        }

        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Максимальный и миниммальный элемент: " + max + " " + min);
        System.out.println("Наибольший по модулю: " + Math.max(Math.abs(max), Math.abs(min)));
    }
}
