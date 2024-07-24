package com.walking.lesson14.polymorphism.task2.model;

public class Dog extends Animal {
    public static final String DOG_SOUND = "Woof";

    @Override
    public void sound() {
        System.out.println(DOG_SOUND);
    }
}
