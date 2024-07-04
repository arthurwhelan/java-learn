package com.walking.lesson5_arrays.task2;

// Создать массив int из 5 элементов. Заполнить его значениями, введенными с клавиатуры. Вывести на экран сумму каждого значения с предыдущим.
// Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.

import java.util.Scanner;

public class ArraySummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumbers = new int[5];
        int counter = 0;

        do {
            System.out.println("Enter number index " + counter);
            arrayNumbers[counter] = scanner.nextInt();
            counter++;
        }
        while (counter < arrayNumbers.length);

        System.out.println(arrayNumbers[0] + arrayNumbers[arrayNumbers.length - 1]);

        for (int i = 1; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i] + arrayNumbers[i -1]);
        }
    }
}
