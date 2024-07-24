package com.walking.lesson10.fields.constants.task3;

// Вынесите поиск простых чисел в отдельный класс.
// Реализуйте возможность вывода на экран суммы N первых простых чисел, где N – число, введенное пользователем с клавиатуры;
// Вынесите нужные вам переменные в поля класса. Если необходимо – сделайте их константами уровня класса или объекта.
// Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта. Массив – ссылочный тип.

import com.walking.lesson10.fields.constants.task3.model.FindPrimeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of prime numbers: ");
        int num = scanner.nextInt();

        scanner.close();

        FindPrimeNumbers findPrimeNumbers = new FindPrimeNumbers(num);
        int[] primeNumbers = findPrimeNumbers.findPrimeNumbers();

        System.out.println(sum(primeNumbers));
    }

    static int sum(int[] primeNumbers) {
        int counter = 0;
        return sum(primeNumbers, counter);
    }

    static int sum(int[] primeNumbers, int counter) {

        if (counter != primeNumbers.length - 1) {
            return primeNumbers[counter] + sum(primeNumbers, ++counter);
        }

        return primeNumbers[counter];
    }
}