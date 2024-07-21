package com.walking.lesson17_enum.task3;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1
// через enum. Пусть EquilateralTriangle и Square будут значениями enum's EquilateralShape

import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralFigure;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.EquilateralTriangle;
import com.walking.lesson14_polymorphism_overriding_method.task1.model.Square;
import com.walking.lesson17_enum.task3.shape.EquilateralShapeType;

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
       EquilateralShapeType shapeType;

        switch (selectedShape) {
            case 1:
                shapeType = EquilateralShapeType.SQUARE;
                break;
            case 2:
                shapeType = EquilateralShapeType.EQUILATERAL_TRIANGLE;
                break;
            default:
                return "Unknown shape";
        }

        return shapeType.createShape(sideLength);
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

