package com.walking.lesson17_enum.task1;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
// через enum. В т.ч. реализуйте в enum's поиск значения по фразе, введенной пользователем.

import com.walking.lesson17_enum.task1.answer.GreetingType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your greeting: ");
        String greeting = scanner.nextLine();

        scanner.close();

        GreetingType greetingType = GreetingType.findGreetingType(greeting);
        System.out.println(greetingType.getAnswer());
    }
}
