package com.walking.lesson14.polymorphism.task2.model;

public class Cat extends Animal {
    public static final String CAT_SOUND = "Meow";

    @Override
    public void sound() {
        System.out.println(CAT_SOUND);
    }
}
