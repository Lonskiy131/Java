package com.education.ztu;

import java.util.Scanner;

public class Task5 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println("Сума цифр числа: " + sum);    }
}
