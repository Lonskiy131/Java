package com.education.ztu;

public class Task6 {
    static int[] fibonacci(int number) {
        int[] fibArray = new int[number];
        if (number >= 1) {
            fibArray[0] = 1;
        }
        if (number >= 2) {
            fibArray[1] = 1;
        }
        for (int i = 2; i < number; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;

    }

    public static void main() {
        int n = 10;
        int[] fibSequence = fibonacci(n);

        System.out.println("Масив чисел Фібоначчі:");
        for (int num : fibSequence) {
            System.out.print(num + " ");
    }
}
}
