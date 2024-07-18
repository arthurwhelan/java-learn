package com.walking.lesson17_enum.task3;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1
// через enum. Пусть EquilateralTriangle и Square будут значениями enum's EquilateralShape

import com.walking.lesson17_enum.task3.shape.EquilateralShapeType;

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
            String printShape = selectedShape == 1
                    ? EquilateralShapeType.SQUARE.createShape(sideLength)
                    : EquilateralShapeType.EQUILATERAL_TRIANGLE.createShape(sideLength);

            System.out.println(printShape);
        }
    }

    private static boolean validation(int sideLength, int selectedShape) {
        return selectedShape > 0 && selectedShape < 3 && sideLength > 0;
    }
}

