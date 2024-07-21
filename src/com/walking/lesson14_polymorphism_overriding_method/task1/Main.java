package com.walking.lesson14_polymorphism_overriding_method.task1;

// Реализуйте класс «Правильная фигура». Для него создайте классы-наследники Треугольник и Квадрат.
// Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
// Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
// Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.

import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralFigure;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralTriangle;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length: ");
        int sideLength = scanner.nextInt();

        if (!validateSideLength(sideLength)) {
            return;
        }

        System.out.println("Select a shape:\n1. square\n2. triangle");
        int selectedShape = scanner.nextInt();

        if (!validateSelectedShape(selectedShape)) {
            return;
        }

        scanner.close();

        String shapeString = createEquilateralFigure(sideLength, selectedShape);
        System.out.println(shapeString);
    }

    private static String createEquilateralFigure(int sideLength, int selectedShape) {
        EquilateralFigure shape;

        switch (selectedShape) {
            case 1:
                shape = new Square(sideLength);
                break;
            case 2:
                shape = new EquilateralTriangle(sideLength);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createFigure();
    }

    private static boolean validateSideLength(int sideLength) {
        if (sideLength < 1) {
            System.out.println("Invalid side length. Side length must be greater than 0.");
            return false;
        }

        return true;
    }

    private static boolean validateSelectedShape(int selectedShape) {
        if (selectedShape < 1 || selectedShape > 2) {
            System.out.println("Invalid selected shape.");
            return false;
        }

        return true;
    }
}
