package com.walking.lesson18_check_types.task1_instanceof.model;

public class Cow extends Animal {
    public static final String CowSound = "Moo";

    public Cow() {
        super(CowSound);
    }

    public void moo() {
        sound();
    }
}
