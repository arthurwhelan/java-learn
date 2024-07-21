package com.walking.lesson18_check_types.task1_instanceof.model;

public class Animal {
    private final String SOUND;

    public Animal(String sound) {
        this.SOUND = sound;
    }

    protected void sound() {
        System.out.println(SOUND);
    }
}
