package com.walking.lesson20.exceptions.task3;

// Реализуйте любой из вариантов задачи в уроке 18. Для ситуации, когда тип животного неизвестен, выбрасывайте собственное исключение UnknownAnimalException.
// Предка исключения определите самостоятельно.
// Также предусмотрите валидацию массива животных на содержание пустых элементов.
// Если таковые существуют – бросьте кастомное исключение ArrayValidationException, которое содержит информацию об индексе массива, содержащем null.

import com.walking.lesson20.exceptions.task3.exception.ArrayValidationException;
import com.walking.lesson20.exceptions.task3.model.Cat;
import com.walking.lesson20.exceptions.task3.model.Cow;
import com.walking.lesson20.exceptions.task3.model.Dog;
import com.walking.lesson20.exceptions.task3.exception.UnknownAnimalException;
import com.walking.lesson20.exceptions.task3.model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(), new Dog(), new Cow()};

        getAllSound(animal);
    }

    private static void getAllSound(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                throw new ArrayValidationException(i);
            }

            soundAnimal(animals[i]);
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
            throw new UnknownAnimalException("Unknown animal class");
        }
    }
}
