package com.walking.lesson20.exceptions.task3.model;

public class Cow extends Animal {
    public static final String CowSound = "Moo";

    public Cow() {
        super(CowSound);
    }

    public void moo() {
        sound();
    }
}
