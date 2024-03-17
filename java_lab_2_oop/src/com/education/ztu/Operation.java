package com.education.ztu;

// Клас Operation
public class Operation {
    public static float addition(float... numbers) {
        float sum = 0;
        for (float num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static float subtraction(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static float multiplication(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float result = 1;
        for (float num : numbers) {
            result *= num;
        }
        return result;
    }

    public static float division(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result /= numbers[i];
            } else {
                System.out.println("Division by zero is not allowed.");
                return Float.NaN;
            }
        }
        return result;
    }

    public static float average(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float sum = addition(numbers);
        return sum / numbers.length;
    }

    public static float maximum(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float max = numbers[0];
        for (float num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static float minimum(float... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        float min = numbers[0];
        for (float num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
