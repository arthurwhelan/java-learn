package com.walking.lesson7_methods_varargs_overloading_method_recursion.task4;

// Вычислите результат выражения sqrt(1+sqrt(2+…+sqrt(n))), используя рекурсивный алгоритм. n — число, введенное с клавиатуры.
// Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.

import java.util.Scanner;

public class NestedRadical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scan.nextInt();

        scan.close();

        System.out.println(getNestedRadical(num));
    }

    static boolean validation(int n) {
        if (n < 1) {
            System.out.println("The number must be greater than zero");
            return false;
        }

        return true;
    }

    static double getNestedRadical(int n) {
        if (!validation(n)) {
            return -1;
        }

        return getNestedRadical(n, 1);
    }

    static double getNestedRadical(int n, int c) {
        if (c == n) {
            return Math.sqrt(n);
        }

        return Math.sqrt(c + getNestedRadical(n, c + 1));
    }
}

