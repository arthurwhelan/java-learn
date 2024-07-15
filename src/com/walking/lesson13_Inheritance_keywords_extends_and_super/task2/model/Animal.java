package com.walking.lesson13_Inheritance_keywords_extends_and_super.task2.model;

public class Animal {
    private final String CLASS_NAME;
    private final String SOUND;

    public Animal(String className, String sound) {
        this.CLASS_NAME = className;
        this.SOUND = sound;
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    protected void sound() {
        System.out.println(SOUND);
    }
}
