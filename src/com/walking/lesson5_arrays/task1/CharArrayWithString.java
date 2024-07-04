package com.walking.lesson5_arrays.task1;

// Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
// Предварительно собрав значения массива в переменную типа String.

public class CharArrayWithString {
    public static void main(String[] args) {
        char[] name = {'J', 'o', 'h', 'n'};

        String acc = "";

        for (char element : name) {
            acc += element;
        }

        System.out.println(acc);
    }
}

