package com.walking.lesson13_Inheritance_keywords_extends_and_super.task1.model;

public class Cat extends Animal {
    public Cat() {
        System.out.println("I’m a cat");
    }

    public Cat(String color) {
        this();

        System.out.println("I'm a " + color + " cat");
    }
}
