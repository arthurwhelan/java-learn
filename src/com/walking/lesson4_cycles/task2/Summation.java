package com.walking.lesson4_cycles.task2;

// Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        int counter = 0;

        while (number != 0) {
            counter += number % 10;

            number /= 10;
        }

        if (counter < 0) {
            counter *= -1;
        }

        System.out.println(counter);
    }
}
