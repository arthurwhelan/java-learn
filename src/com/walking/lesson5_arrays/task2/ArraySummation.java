package com.walking.lesson5_arrays.task2;

// Создать массив int из 5 элементов. Заполнить его значениями, введенными с клавиатуры. Вывести на экран сумму каждого значения с предыдущим.
// Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.

import java.util.Scanner;

public class ArraySummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        int lastIndex = numbers.length - 1;

        for (int i = 0; i <= lastIndex; i++) {
            System.out.println("Enter number index: " + i);
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i <= lastIndex; i++) {
            int j = i == 0 ? lastIndex : i - 1;

            int sum = numbers[i] + numbers[j];

            System.out.println(sum);
        }
    }
}
