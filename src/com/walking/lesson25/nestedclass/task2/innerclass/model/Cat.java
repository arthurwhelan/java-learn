package com.walking.lesson25.nestedclass.task2.innerclass.model;

public class Cat extends Animal {
    public static final String CAT_SOUND = "Meow";

    @Override
    public void sound() {
        System.out.println(CAT_SOUND);
    }
}
