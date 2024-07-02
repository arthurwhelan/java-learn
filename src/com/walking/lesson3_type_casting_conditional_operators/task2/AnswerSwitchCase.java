package com.walking.lesson3_type_casting_conditional_operators.task2;

// Написать программу, которая принимает строку с клавиатуры:
//Если введенная строка равна Hi - вывести в консоль Hello;
//Если Bye - Good bye;
//Если How are you - How are your doing;
//Если любая другая строка - вывести Unknown message.

import java.util.Scanner;

public class AnswerSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = scanner.nextLine();

        scanner.close();

        switch (message) {
            case "Hi":
                System.out.println("Hello");
                break;

            case "Bye":
                System.out.println("Good bye");
                break;

            case "How are you":
                System.out.println("How are you doing");
                break;

            default:
                System.out.println("Unknown message");
        }
    }
}
