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
            boolean isPrime = true;

            for (int j = 0; j <= i; j++) {

                if (value % primeNumbers[j] == 0) {
                    isPrime = false;
                    i -= 1;
                    break;
                }
            }

            if (isPrime && primeNumbers[primeNumbers.length - 1] == 0) {
                primeNumbers[i + 1] = value;
            }

            value += 2;
        }

        int sumNumbers = 0;

        for (int primeNumber : primeNumbers) {
            sumNumbers += primeNumber;
        }

        System.out.println(sumNumbers);
    }
}