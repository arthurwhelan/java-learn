package com.walking.lesson7.varargs.recursion.task3;

// Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.

public class RecursiveFactorial {
    public static void main(String[] args) {
        int result = getFactorial(5);
        System.out.println(result);
    }

    static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}

