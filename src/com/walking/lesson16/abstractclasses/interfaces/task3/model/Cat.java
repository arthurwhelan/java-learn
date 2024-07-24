package com.walking.lesson16.abstractclasses.interfaces.task3.model;

public class Cat extends Animal {
    public static final String catSound = "Meow";

    @Override
    public void sound() {
        System.out.println(catSound);
    }
}
