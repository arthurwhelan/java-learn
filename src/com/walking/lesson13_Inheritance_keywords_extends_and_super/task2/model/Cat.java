package com.walking.lesson13_Inheritance_keywords_extends_and_super.task2.model;

public class Cat extends Animal {
    public static final String CatClass = "Cat";

    public Cat() {
        super(CatClass, "Meow");
    }

    public void meow() {
        sound();
    }
}
