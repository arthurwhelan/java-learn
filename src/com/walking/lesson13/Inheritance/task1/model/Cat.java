package com.walking.lesson13.Inheritance.task1.model;

public class Cat extends Animal {
    public Cat() {
        System.out.println("I’m a cat");
    }

    public Cat(String color) {
        this();

        System.out.println("I'm a " + color + " cat");
    }
}
