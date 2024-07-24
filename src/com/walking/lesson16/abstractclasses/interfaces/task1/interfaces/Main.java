package com.walking.lesson16.abstractclasses.interfaces.task1.interfaces;

// Реализуйте задачу с помощью интерфейса.
// Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
// Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
// Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.

import com.walking.lesson16.abstractclasses.interfaces.task1.interfaces.model.Figure;
import com.walking.lesson16.abstractclasses.interfaces.task1.interfaces.model.EquilateralTriangle;
import com.walking.lesson16.abstractclasses.interfaces.task1.interfaces.model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length: ");
        int sideLength = scanner.nextInt();

        System.out.println("Select a shape:\n1. square\n2. triangle");
        int selectedShape = scanner.nextInt();

        scanner.close();

        if (!validation(sideLength, selectedShape)) {
            System.out.println("Invalid side length or unknown shape");
        } else {
            Figure shape = selectedShape == 1 ? new Square(sideLength) : new EquilateralTriangle(sideLength);
            System.out.println(shape.createFigure());
        }
    }

    private static boolean validation(int sideLength, int selectedShape) {
        return selectedShape > 0 && selectedShape < 3 && sideLength > 0;
    }
}
