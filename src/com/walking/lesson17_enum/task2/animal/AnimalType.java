package com.walking.lesson17_enum.task2.animal;

public enum AnimalType {
    CAT("Meow"),
    DOG("Woof"),
    COW("Moo");

    private final String sound;

    AnimalType(String animalSound) {
        this.sound = animalSound;
    }

    public String getSound() {
        return sound;
    }

    public void sound() {
        System.out.println(sound);
    }
}
