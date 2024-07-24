package com.walking.lesson1.variables.datatypes.task1;

// На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
// Подсказка: можно использовать третью переменную.
// Вариант на подумать: реализовать задачу, НЕ используя третью переменную.

public class WithThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = b;
        b = b - a;
        a = c;

        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
