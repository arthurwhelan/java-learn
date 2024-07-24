package com.walking.lesson17_enum.task2;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task2
// через enum. Пусть Cow, Dog и Cat будут значениями enum's Animal.

import com.walking.lesson17_enum.task2.animal.AnimalType;

public class Main {
    public static void main(String[] args) {
        AnimalType[] animalTypes = new AnimalType[]{AnimalType.DOG, AnimalType.CAT, AnimalType.COW};

        getAllSound(animalTypes);
    }

    private static void getAllSound(AnimalType[] animalTypes) {
        for (AnimalType animalType : animalTypes) {
            animalType.sound();
        }
    }

}
