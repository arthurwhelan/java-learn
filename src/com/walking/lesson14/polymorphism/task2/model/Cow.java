package com.walking.lesson14.polymorphism.task2.model;

public class Cow extends Animal {
    public static final String COW_SOUND = "Moo";

    @Override
    public void sound() {
        System.out.println(COW_SOUND);
    }
}
