package com.education.ztu;

import com.education.ztu.Operation;

public class Main2 {
    public static void main(String[] args) {
        float additionResult = Operation.addition(1,2,3,4,5,6,7,8,9,10);
        float subtractionResult = Operation.subtraction(1,2,3,4,5,6,7,8,9,10);
        float multiplicationResult = Operation.multiplication(1,2,3,4,5,6,7,8,9,10);
        float divisionResult = Operation.division(1,2,3,4,5);
        float averageResult = Operation.average(1,2,3,4,5,6,7,8,9,10);
        float maximumResult = Operation.maximum(1,2,3,4,5,100,6,7,8,9,10);
        float minimumResult = Operation.minimum(1,2,3,4,5,100,6,0,8,9,10);

        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Division result: " + divisionResult);
        System.out.println("Average result: " + averageResult);
        System.out.println("Maximum result: " + maximumResult);
        System.out.println("Minimum result: " + minimumResult);
    }
}
