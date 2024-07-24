package com.walking.lesson3.typecasting.task4;

// Введите с клавиатуры два целых числа. Если первое – четное ИЛИ второе – кратно трем, выведите в консоль результат сравнения этих чисел в любом формате.
// Например, Число1 больше Числа2. Или true (если числа равны) и false - если нет.
// Если первое число кратно и двум, и трем – также выведите на экран число один, возведенное в степень N, где N – второе число.
// Для возведения в степень можно использовать Math.pow().
// В случае, если результат выражения выходит за пределы типа int (допустимые значения - [-2147483648; 2147483647]) – вывести сообщение Результат выражения слишком большой!.
// Также минимальное и максимальное значение int содержится в константах Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.

import java.util.Scanner;

public class NumberComparison {
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
            double result = Math.pow(firstNumber, secondNumber);

            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                System.out.println("The result of the expression is too large");
            } else {
                System.out.println((int)result);
            }
        }
    }
}
