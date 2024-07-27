package com.walking.lesson25.nestedclass.task2.innerclass;

// Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
// https://telegra.ph/Nasledovanie-Klyuchevoe-slovo-extends-i-ispolzovanie-protected-Klyuchevoe-slovo-super-Privedenie-ssylochnyh-tipov-11-23
// Допустимо использовать метод sound() вместо woof(), meow() и moo().
// Метод sound() допустимо сделать публичным.

import com.walking.lesson25.nestedclass.task2.innerclass.model.Animal;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Animal[] animals = {main.new Cat(), main.new Dog(), main.new Cow()};

        getAnimalSound(animals);
    }

    private static void getAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }

    private class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    private class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("Moo");
        }
    }
}
