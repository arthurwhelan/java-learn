package com.walking.lesson7_methods_varargs_overloading_method_recursion.task5;

// Вычислить и записать в массив первые 10 простых чисел.
// Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
// Вывести в консоль сумму всех элементов полученного массива.

public class PrimeNumbersRecursion {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        primeNumbers[0] = 2;

        for (int i = 1; i < primeNumbers.length; i++) {
            int addingNumber = i == 1 ? primeNumbers[i - 1] + 1 : primeNumbers[i - 1] + 2;

            primeNumbers[i] = getPrimeNumber(i, addingNumber, primeNumbers);
        }

        System.out.println(getSum(primeNumbers));
    }

    static int getPrimeNumber(int index, int addingNumber, int[] primeNumbers) {
        boolean isPrime = isPrime(index, addingNumber, primeNumbers);

        if (isPrime) {
            return addingNumber;
        }

        addingNumber += 2;

        return getPrimeNumber(index, addingNumber, primeNumbers);
    }

    static boolean isPrime(int index, int addValue, int[] primeNumbers) {
        boolean isPrime = true;

        for (int j = 0; j < index; j++) {
            if (addValue % primeNumbers[j] == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    static int getSum(int[] primeNumbers) {
        int counter = 0;
        return getSum(primeNumbers, counter);
    }

    static int getSum(int[] primeNumbers, int counter) {

        if (!(counter == primeNumbers.length - 1)) {
            return primeNumbers[counter] + getSum(primeNumbers, ++counter);
        }

        return primeNumbers[counter];
    }
}
