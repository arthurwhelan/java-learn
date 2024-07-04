package com.walking.lesson5_arrays.task1;

// Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
// Не используя переменную типа String;


public class CharArrayWithoutString {
    public static void main(String[] args) {
        char[] charArray = {'J', 'o', 'h', 'n'};

        for (char charElem : charArray) {
            System.out.print(charElem);
        }
    }
}
