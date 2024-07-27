package com.walking.lesson25.nestedclass.task2.innerclass;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task2
//используя внутренние классы;

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
