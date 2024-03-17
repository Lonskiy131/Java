package com.education.ztu;
import java.util.Scanner;

public class Task7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість елементів у масиві: ");
        int n = scanner.nextInt();

        int[] fibArray = new int[n];
        int[] reversedFibArray = new int[n];


        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibArray[i] = 1;
            } else {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }
        }

        for (int i = 0; i < n; i++) {
            reversedFibArray[i] = fibArray[n - i - 1];
        }

        System.out.println("Зростаюча послідовність Фібоначчі:");
        for (int num : fibArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Зворотня послідовність Фібоначчі:");
        for (int num : reversedFibArray) {
            System.out.print(num + " ");
        }
    }
}
