package com.walking.lesson4_cycles.task1;

// Ввести с клавиатуры целое число. Вывести в консоль его факториал.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        scanner.close();

        int counter = 1;

        if (number < 0) {
            System.out.println("The number must be zero or higher");
        } else if (number == 0) {
            System.out.println(counter);
        } else {
            for (int i = 1; i <= number; i++) {
                counter *= i;
            }

            System.out.println(counter);
        }
    }
}
