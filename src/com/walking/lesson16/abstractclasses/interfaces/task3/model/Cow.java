package com.walking.lesson16.abstractclasses.interfaces.task3.model;

public class Cow extends Animal {
    public static final String cowSound = "Moo";

    @Override
    public void sound() {
        System.out.println(cowSound);
    }
}
