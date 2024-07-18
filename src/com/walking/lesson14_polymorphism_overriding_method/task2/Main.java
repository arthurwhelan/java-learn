package com.walking.lesson14_polymorphism_overriding_method.task2;

// Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
// https://telegra.ph/Nasledovanie-Klyuchevoe-slovo-extends-i-ispolzovanie-protected-Klyuchevoe-slovo-super-Privedenie-ssylochnyh-tipov-11-23
// Допустимо использовать метод sound() вместо woof(), meow() и moo().
// Метод sound() допустимо сделать публичным.

import com.walking.lesson14_polymorphism_overriding_method.task2.model.Animal;
import com.walking.lesson14_polymorphism_overriding_method.task2.model.Cat;
import com.walking.lesson14_polymorphism_overriding_method.task2.model.Cow;
import com.walking.lesson14_polymorphism_overriding_method.task2.model.Dog;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Cow()};

        getAnimalSound(animals);
    }

    private static void getAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
