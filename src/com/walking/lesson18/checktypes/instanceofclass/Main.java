package com.walking.lesson18.checktypes.task1.instanceofclass;

// Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
// Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
// Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
// Каждый из методов должен выводить в консоль соответствующую ему строку: woof, meow или moo.
// В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
// Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
// Использовать при решении instanceof, getClass() или другие еще неизвестные нам механики – недопустимо.
// Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.

import com.walking.lesson18.checktypes.task1.instanceofclass.model.Animal;
import com.walking.lesson18.checktypes.task1.instanceofclass.model.Cat;
import com.walking.lesson18.checktypes.task1.instanceofclass.model.Cow;
import com.walking.lesson18.checktypes.task1.instanceofclass.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(), new Dog(), new Cow()};

        getAllSound(animal);
    }

    private static void getAllSound(Animal[] animals) {
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        if (animal instanceof Dog dogSound) {
            dogSound.woof();
        } else if (animal instanceof Cat catSound) {
            catSound.meow();
        } else if (animal instanceof Cow cowSound) {
            cowSound.moo();
        } else {
            System.out.println("Unknown animal class");
        }
    }
}
