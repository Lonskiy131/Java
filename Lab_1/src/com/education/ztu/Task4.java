package com.education.ztu;

import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int gcd = a;

        System.out.println("Найбільший спільний дільник: " + gcd);
    }
}
