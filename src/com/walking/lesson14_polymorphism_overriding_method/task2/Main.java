package com.walking.lesson14_polymorphism_overriding_method.task2;

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
