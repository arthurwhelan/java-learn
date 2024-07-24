package com.walking.lesson18.checktypes.task1.instanceofclass.model;

public class Animal {
    private final String SOUND;

    public Animal(String sound) {
        this.SOUND = sound;
    }

    protected void sound() {
        System.out.println(SOUND);
    }
}
