package com.walking.lesson13.Inheritance.task1.model;

public class Dog extends Animal {
    private Dog() {
        System.out.println("I’m a dog");
    }

    public Dog(String color) {
        this();

        System.out.println("I'm a " + color + " dog");
    }
}
