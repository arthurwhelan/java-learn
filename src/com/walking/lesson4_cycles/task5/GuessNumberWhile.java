package com.walking.lesson4_cycles.task5;

// Выводить на экран Не угадал! до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры
// перед выводом на экран Не угадал!

import java.util.Scanner;

public class GuessNumberWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number: ");

        while (scanner.nextInt() != 1) {
            System.out.println("Did not guess! Try again: ");
        }

        System.out.println("You guessed it!");

        scanner.close();
    }
}
