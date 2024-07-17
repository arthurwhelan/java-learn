package com.walking.lesson16.abstract_classes_and_interfaces.task3.model;

public class Cat extends Animal {
    public static final String catSound = "Meow";

    @Override
    public void sound() {
        System.out.println(catSound);
    }
}
