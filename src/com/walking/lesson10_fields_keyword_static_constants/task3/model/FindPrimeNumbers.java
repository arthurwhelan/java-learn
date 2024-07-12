package com.walking.lesson10_fields_keyword_static_constants.task3.model;

// Вычислить и записать в массив первые 10 простых чисел.
// Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
// Вывести в консоль сумму всех элементов полученного массива.

public class FindPrimeNumbers {
    public final int[] primeNumbers;

    public FindPrimeNumbers(int quantity) {
        this.primeNumbers = new int[quantity];
        this.primeNumbers[0] = 2;
    }

    public int[] findPrimeNumbers() {

        for (int i = 1; i < primeNumbers.length; i++) {
            int addNumber = i == 1 ? primeNumbers[i - 1] + 1 : primeNumbers[i - 1] + 2;

            primeNumbers[i] = findPrimeNumber(i, addNumber, primeNumbers);
        }

        return primeNumbers;
    }

    int findPrimeNumber(int index, int addNumber, int[] primeNumbers) {
        boolean isPrime = isPrime(index, addNumber, primeNumbers);

        if (isPrime) {
            return addNumber;
        }

        addNumber += 2;

        return findPrimeNumber(index, addNumber, primeNumbers);
    }

    boolean isPrime(int index, int addValue, int[] primeNumbers) {
        for (int j = 0; j < index; j++) {
            if (addValue % primeNumbers[j] == 0) {
                return false;
            }
        }

        return true;
    }
}