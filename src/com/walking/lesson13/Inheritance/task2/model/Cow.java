package com.walking.lesson13.Inheritance.task2.model;

public class Cow extends Animal {
    public static final String CowClass = "Cow";

    public Cow() {
        super(CowClass, "Moo");
    }

    public void moo() {
        sound();
    }
}
