package com.walking.lesson25.nestedclass.task2.anonymusclass;

// Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
// https://telegra.ph/Nasledovanie-Klyuchevoe-slovo-extends-i-ispolzovanie-protected-Klyuchevoe-slovo-super-Privedenie-ssylochnyh-tipov-11-23
// Допустимо использовать метод sound() вместо woof(), meow() и moo().
// Метод sound() допустимо сделать публичным.

import com.walking.lesson25.nestedclass.task2.anonymusclass.model.Animal;
import com.walking.lesson25.nestedclass.task2.anonymusclass.model.Cat;
import com.walking.lesson25.nestedclass.task2.anonymusclass.model.Cow;
import com.walking.lesson25.nestedclass.task2.anonymusclass.model.Dog;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {createCat(), createDog(), createCow()};

        getAnimalSound(animals);
    }

    private static void getAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static Animal createCat() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("Meow");
            }
        };
    }

    private static Animal createDog() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("Woof");
            }
        };
    }

    private static Animal createCow() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("Moo");
            }
        };
    }
}
