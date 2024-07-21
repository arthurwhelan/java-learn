package com.walking.lesson18_check_types.task1_instanceof.model;

public class Dog extends Animal {
    public static final String DogSound = "Woof";

    public Dog() {
        super(DogSound);
    }

    public void woof() {
        sound();
    }
}
