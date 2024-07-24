package com.walking.lesson13.Inheritance.task1;

// Реализовать класс Animal, содержащий protected-конструктор без параметров, который выводит в консоль сообщение I’m an animal.
// Реализовать для Animal классы-наследники Dog и Cat.
// Реализовать для каждого из них приватный конструктор без параметров, который выводит в консоль сообщение I’m a dog (I’m a cat).
// Также реализовать публичный конструктор, принимающий строковый параметр color.
// Он должен вызывать конструктор без параметров, а также выводить в консоль сообщение I’m a <color> dog
// (I’m a <color> cat), где color – значение параметра конструктора color.

import com.walking.lesson13.Inheritance.task1.model.Cat;
import com.walking.lesson13.Inheritance.task1.model.Dog;

public class Main {
    public static void main(String[] args) {
        new Dog("black");
        new Cat("white");
    }
}
