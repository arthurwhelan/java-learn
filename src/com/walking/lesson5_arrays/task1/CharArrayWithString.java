package com.walking.lesson5_arrays.task1;

// Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
// Предварительно собрав значения массива в переменную типа String.

public class CharArrayWithString {
    public static void main(String[] args) {
        char[] charArray = {'J', 'o', 'h', 'n'};

        String charAcc = "";

        for (char charElem : charArray) {
            charAcc += charElem;
        }

        System.out.println(charAcc);
    }
}

