package com.walking.lesson13.Inheritance.task2.model;

public class Dog extends Animal {
    public static final String DogClass = "Dog";

    public Dog() {
        super(DogClass, "Woof");
    }

    public void woof() {
        sound();
    }
}
