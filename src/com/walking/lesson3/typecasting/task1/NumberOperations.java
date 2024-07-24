package com.walking.lesson3.typecasting.task1;

// Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел (пр.1), если нет - частное (пр.2).
// Также если числа равны - вывести надпись Числа равны!
//пр1.: Число1 * Число2 = Произведение, где число1 - значение 1-го числа, число2 - значение 2-го числа, Произведение - результат умножения.
//пр2.: Число1 / Число2 = Частное, где число1 - значение 1-го числа, число2 - значение 2-го числа, Частное - результат деления. Помните, что в Java результатом деления двух целых чисел будет целое число.

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        if (firstNumber % 2 == 0) {
            System.out.println(firstNumber * secondNumber);
        } else if (secondNumber == 0) {
            System.out.println("You can't divide by zero");
        } else {
            System.out.println((double) firstNumber / secondNumber);
        }

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
        }
    }
}
