package com.education.ztu;
import java.util.Scanner;

public class Task2 {
    public static void main() {
        //here should be a solution to the task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Сума чисел: " + sum);
    }
}
