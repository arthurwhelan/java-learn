package com.walking.lesson8.classes.objectsconstructors.task1;

// Реализовать класс-счетчик. Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
// Реализовать для созданного класса конструктор с двумя параметрами, с одним (значение счетчика в таком случае инициализировать как 0),
// методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целое значение. Методы должны возвращать актуальное значение счетчика.
// Используя созданный класс, посчитать количество четных и количество нечетных чисел в ряду от 1 до 100. Конечные показатели счетчиков вывести в консоль.

import com.walking.lesson8.classes.objectsconstructors.task1.model.Counter;

public class Main {
    public static void main(String[] args) {
        Counter eventCounter = new Counter("Even counter");
        Counter oddCounter = new Counter("Odd counter");

        numbersCounter(eventCounter, oddCounter);
    }

    static void numbersCounter(Counter even, Counter odd) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even.incrementValue();
            } else {
                odd.incrementValue();
            }
        }

        printCounter(even);
        printCounter(odd);
    }

    static void printCounter(Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
