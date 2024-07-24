package com.walking.lesson20.exceptions.task2;

// Реализуйте любой из вариантов Задачи 1 в уроке 16. При некорректном вводе с клавиатуры выбрасывайте собственное исключение InputValidationException.
// Не забудьте указать в описании, какой именно из вводов был некорректен - message исключения должен быть информативным. Предка исключения определите самостоятельно.

import com.walking.lesson17_enum.task3.shape.EquilateralShapeType;
import com.walking.lesson20.exceptions.task2.exception.InputValidationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length: ");

        int sideLength = scanner.nextInt();

        if (sideLength < 1) {
            throw new InputValidationException("Invalid side length. Side length must be greater than 0.");
        }

        System.out.println("Select a shape:\n1. square\n2. triangle");
        int selectedShape = scanner.nextInt();

        if (selectedShape < 1 || selectedShape > 2) {
            throw new InputValidationException("Invalid shape. Shape must be between 1 and 2.");
        }

        String shapeString = createEquilateralFigure(sideLength, selectedShape);
        System.out.println(shapeString);

        scanner.close();
    }

    private static String createEquilateralFigure(int sideLength, int selectedShape) {
        return switch (selectedShape) {
            case 1 -> EquilateralShapeType.SQUARE.createShape(sideLength);
            case 2 -> EquilateralShapeType.EQUILATERAL_TRIANGLE.createShape(sideLength);
            default -> null;
        };
    }
}
