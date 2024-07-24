package com.walking.lesson3.typecasting.task2;

// Написать программу, которая принимает строку с клавиатуры:
//Если введенная строка равна Hi - вывести в консоль Hello;
//Если Bye - Good bye;
//Если How are you - How are your doing;
//Если любая другая строка - вывести Unknown message.

import java.util.Scanner;

public class MessageIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = scanner.nextLine();

        scanner.close();

        if (message.equals("Hi")) {
            System.out.println("Hello");
        } else if (message.equals("Bye")) {
            System.out.println("Good bye");
        } else if (message.equals("How are you")) {
            System.out.println("How are you doing");
        } else {
            System.out.println("Unknown message");
        }
    }
}
