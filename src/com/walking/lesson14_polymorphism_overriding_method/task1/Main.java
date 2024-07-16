package com.walking.lesson14_polymorphism_overriding_method.task1;

// Реализуйте класс «Правильная фигура». Для него создайте классы-наследники Треугольник и Квадрат.
// Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
// Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
// Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.

import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralFigure;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralRectangle;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.Square;

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
            EquilateralFigure shape = selectedShape == 1 ? new Square(sideLength) : new EquilateralRectangle(sideLength);
            System.out.println(shape.createFigure());
        }
    }

    private static boolean validation(int sideLength, int selectedShape) {
        return selectedShape > 0 && selectedShape < 3 && sideLength > 0;
    }
}
