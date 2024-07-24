package com.walking.lesson6.methods.task2;

// Декомпозировать задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task4.java
// Вынести в отдельный метод логику, которая отрабатывает, когда первое число кратно и двум, и трем.

import java.util.Scanner;

public class NumberComparisonMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        if (firstNumber % 2 == 0 || secondNumber % 3 == 0) {
            System.out.println(firstNumber > secondNumber);
        }

        if (firstNumber % 6 == 0) {
            exponentiation(firstNumber, secondNumber);
        }
    }

    static void exponentiation(int a, int b) {
        double result = Math.pow(a, b);

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            System.out.println("The result of the expression is too large");
        } else {
            System.out.println((int) result);
        }
    }
}
