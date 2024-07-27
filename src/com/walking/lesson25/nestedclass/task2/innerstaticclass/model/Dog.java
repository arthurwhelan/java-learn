package com.walking.lesson25.nestedclass.task2.innerclass.model;

public class Dog extends Animal {
    public static final String DOG_SOUND = "Woof";

    @Override
    public void sound() {
        System.out.println(DOG_SOUND);
    }
}
