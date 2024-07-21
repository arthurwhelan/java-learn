package com.walking.lesson18_check_types.task1_getclass.model;

public class Cat extends Animal {
    public static final String CatSound = "Meow";

    public Cat() {
        super(CatSound);
    }

    public void meow() {
        sound();
    }
}
