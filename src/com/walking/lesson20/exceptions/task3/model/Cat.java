package com.walking.lesson20.exceptions.task3.model;

public class Cat extends Animal {
    public static final String CatSound = "Meow";

    public Cat() {
        super(CatSound);
    }

    public void meow() {
        sound();
    }
}
