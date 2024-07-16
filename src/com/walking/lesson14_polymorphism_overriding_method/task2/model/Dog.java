package com.walking.lesson14_polymorphism_overriding_method.task2.model;

public class Dog extends Animal {
    public static final String DOG_SOUND = "Woof";

    @Override
    public void sound() {
        System.out.println(DOG_SOUND);
    }
}
