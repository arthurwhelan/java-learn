package com.walking.lesson3.typecasting.task3;

// Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно. Выведите в консоль ваше ФИО в одну строку.
// Реализуйте, используя System.out.println()

import java.util.Scanner;

public class FullNamePrintln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the patronymic : ");
        String patronymic = scanner.nextLine();

        scanner.close();

        System.out.println(lastName + " " + firstName + " " + patronymic);
    }
}
