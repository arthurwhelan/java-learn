package com.walking.lesson3_type_casting_conditional_operators.task3;

// Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно. Выведите в консоль ваше ФИО в одну строку.
// Реализуйте, используя System.out.printf()

import java.util.Scanner;

public class FullNamePrintf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter the patronymic: ");
        String patronymic = scan.nextLine();

        scan.close();

        System.out.printf("%s %s %s", lastName, firstName, patronymic);
    }
}
