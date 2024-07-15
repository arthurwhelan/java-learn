package com.walking.lesson13_Inheritance_keywords_extends_and_super.task2.model;

public class Dog extends Animal {
    public static final String DogClass = "Dog";

    public Dog() {
        super(DogClass, "Woof");
    }

    public void woof() {
        sound();
    }
}
