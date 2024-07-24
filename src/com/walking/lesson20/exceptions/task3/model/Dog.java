package com.walking.lesson20.exceptions.task3.model;

public class Dog extends Animal {
    public static final String DogSound = "Woof";

    public Dog() {
        super(DogSound);
    }

    public void woof() {
        sound();
    }
}
