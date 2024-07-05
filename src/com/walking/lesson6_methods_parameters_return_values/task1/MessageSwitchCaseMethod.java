package com.walking.lesson6_methods_parameters_return_values.task1;

// Декомпозировать задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
// Вынести в отдельный метод использование switch-case.
// Также вынести в отдельный метод использование System.out.println

import java.util.Scanner;

public class MessageSwitchCaseMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMessage("Enter your message:");
        String message = scanner.nextLine();

        getAnswer(message);

        scanner.close();
    }

    static void getAnswer(String message) {
        switch (message) {
            case "Hi":
                printMessage("Hello");
                break;

            case "Bye":
                printMessage("Good bye");
                break;

            case "How are you":
                printMessage("How are you doing");
                break;

            default:
                printMessage("Unknown message");
        }
    }

    static void printMessage(String message) {
        System.out.println(message);
    }
}
