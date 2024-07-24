package com.walking.lesson2.basicoperations.task1;

// Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
//c = ba(a + b)/(a2)
//Совпадает ли результат выражения, если a и b — переменные типа int?

import java.util.Scanner;

public class ExpressionResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter an integer b: ");
        double b = scanner.nextDouble();

        scanner.close();

        double c = b * a * (a + b) / (a * a);
        System.out.println("The result is: " + c);
    }
}
