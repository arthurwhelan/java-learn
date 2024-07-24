package com.walking.lesson7.varargs.recursion.task5;

// Вычислить и записать в массив первые 10 простых чисел.
// Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
// Вывести в консоль сумму всех элементов полученного массива.

public class PrimeNumbersRecursion {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        primeNumbers[0] = 2;

        for (int i = 1; i < primeNumbers.length; i++) {
            int addNumber = i == 1
                    ? primeNumbers[i - 1] + 1
                    : primeNumbers[i - 1] + 2;

            primeNumbers[i] = getPrimeNumber(i, addNumber, primeNumbers);
        }

        System.out.println(sum(primeNumbers));
    }

    static int getPrimeNumber(int index, int addNumber, int[] primeNumbers) {
        boolean isPrime = isPrime(index, addNumber, primeNumbers);

        if (isPrime) {
            return addNumber;
        }

        addNumber += 2;

        return getPrimeNumber(index, addNumber, primeNumbers);
    }

    static boolean isPrime(int index, int addValue, int[] primeNumbers) {
        for (int j = 0; j < index; j++) {
            if (addValue % primeNumbers[j] == 0) {
                return false;
            }
        }

        return true;
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