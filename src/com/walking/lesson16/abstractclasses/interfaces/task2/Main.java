package com.walking.lesson16.abstractclasses.interfaces.task2;

// Написать программу при помощт интерфейсов, которая принимает строку с клавиатуры:
// Если введенная строка равна Hi - вывести в консоль Hello;
// Если Bye - Good bye;
// Если How are you - How are your doing;
// Если любая другая строка - вывести Unknown message.

import com.walking.lesson16.abstractclasses.interfaces.task2.answer.Answer;
import com.walking.lesson16.abstractclasses.interfaces.task2.answer.impl.ByeAnswer;
import com.walking.lesson16.abstractclasses.interfaces.task2.answer.impl.HiAnswer;
import com.walking.lesson16.abstractclasses.interfaces.task2.answer.impl.HowAreYouAnswer;
import com.walking.lesson16.abstractclasses.interfaces.task2.answer.impl.UnknownAnswer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message:");
        String message = scanner.nextLine();

        scanner.close();

        System.out.println(getAnswer(message));
    }

    private static String getAnswer(String message) {
        Answer answer = switch (message) {
            case "Hi" -> new HiAnswer();
            case "Bye" -> new ByeAnswer();
            case "How are you" -> new HowAreYouAnswer();
            default -> new UnknownAnswer();
        };

        return  answer.getAnswer();
    }
}
