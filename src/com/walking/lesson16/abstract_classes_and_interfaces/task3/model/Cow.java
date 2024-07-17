package com.walking.lesson16.abstract_classes_and_interfaces.task3.model;

public class Cow extends Animal {
    public static final String cowSound = "Moo";

    @Override
    public void sound() {
        System.out.println(cowSound);
    }
}
