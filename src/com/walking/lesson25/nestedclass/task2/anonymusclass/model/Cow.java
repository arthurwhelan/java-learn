package com.walking.lesson25.nestedclass.task2.anonymusclass.model;

public class Cow extends Animal {
    public static final String COW_SOUND = "Moo";

    @Override
    public void sound() {
        System.out.println(COW_SOUND);
    }
}
