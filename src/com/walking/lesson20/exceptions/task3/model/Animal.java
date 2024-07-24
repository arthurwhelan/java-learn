package com.walking.lesson20.exceptions.task3.model;

public class Animal {
    private final String SOUND;

    public Animal(String sound) {
        this.SOUND = sound;
    }

    protected void sound() {
        System.out.println(SOUND);
    }
}
