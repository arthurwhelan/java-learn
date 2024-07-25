package com.walking.lesson18.checktypes.task1.instanceofclass.model;

public class Dog extends Animal {
    public static final String DogSound = "Woof";

    public Dog() {
        super(DogSound);
    }

    public void woof() {
        sound();
    }
}
