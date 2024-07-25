package com.walking.lesson18.checktypes.task1.getclass.model;

public class Cow extends Animal {
    public static final String CowSound = "Moo";

    public Cow() {
        super(CowSound);
    }

    public void moo() {
        sound();
    }
}
