package com.walking.lesson5_arrays.task3;

// Вычислить и записать в массив первые 10 простых чисел.
// Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
// Вывести в консоль сумму всех элементов полученного массива.

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        primeNumbers[0] = 2;

        int value = 3;

        for (int i = 0; i < primeNumbers.length; i++) {

        }

        int sumNumbers = 0;

        for (int primeNumber : primeNumbers) {
            sumNumbers += primeNumber;
        }

        System.out.println(sumNumbers);
    }
}
