package com.walking.lesson16.abstract_classes_and_interfaces.task3;

// Реализуйте любую задачу из уроков о наследовании или полиморфизме с использованием новых знаний.
// Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
// Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
// Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
// Каждый из методов должен выводить в консоль соответствующую ему строку: woof, meow или moo.
// В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
// Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
// Использовать при решении instanceof, getClass() или другие еще неизвестные нам механики – недопустимо.
// Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.

import com.walking.lesson16.abstract_classes_and_interfaces.task3.model.Animal;
import com.walking.lesson16.abstract_classes_and_interfaces.task3.model.Cat;
import com.walking.lesson16.abstract_classes_and_interfaces.task3.model.Cow;
import com.walking.lesson16.abstract_classes_and_interfaces.task3.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(), new Dog(), new Cow()};

        getAllSound(animal);
    }

    private static void getAllSound(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
