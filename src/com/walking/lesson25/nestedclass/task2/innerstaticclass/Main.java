package com.walking.lesson25.nestedclass.task2.innerstaticclass;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task2
//используя статические вложенные классы.

import com.walking.lesson25.nestedclass.task2.innerstaticclass.model.Animal;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Animal[] animals = {new Cat(), new Dog(), new Cow()};

        getAnimalSound(animals);
    }

    private static void getAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }

    private static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    private static class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("Moo");
        }
    }
}
