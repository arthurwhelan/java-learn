package com.walking.lesson18.checktypes.task1.instanceofclass.model;

public class Cat extends Animal {
    public static final String CatSound = "Meow";

    public Cat() {
        super(CatSound);
    }

    public void meow() {
        sound();
    }
}
