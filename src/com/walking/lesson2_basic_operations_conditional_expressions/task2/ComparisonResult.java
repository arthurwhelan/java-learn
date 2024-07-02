package com.walking.lesson2_basic_operations_conditional_expressions.task2;

// Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:
//a3 > b2

import java.util.Scanner;

public class ComparisonResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer a: ");
        int a = scanner.nextInt();

        System.out.print("Enter an integer b: ");
        int b = scanner.nextInt();

        scanner.close();

        boolean comparisonResult = a * a * a > b * b;
        System.out.println(comparisonResult);
    }
}
