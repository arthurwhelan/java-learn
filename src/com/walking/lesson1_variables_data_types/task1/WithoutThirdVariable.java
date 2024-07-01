package com.walking.lesson1_variables_data_types.task1;

// На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
// Подсказка: можно использовать третью переменную.
// Вариант на подумать: реализовать задачу, НЕ используя третью переменную.

public class WithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        b = b - a;
        a = a + b;

        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
