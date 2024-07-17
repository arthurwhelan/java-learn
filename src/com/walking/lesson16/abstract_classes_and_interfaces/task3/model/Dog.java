package com.walking.lesson16.abstract_classes_and_interfaces.task3.model;

public class Dog extends Animal {
    public static final String dogSound = "Woof";

    @Override
    public void sound() {
        System.out.println(dogSound);
    }
}
