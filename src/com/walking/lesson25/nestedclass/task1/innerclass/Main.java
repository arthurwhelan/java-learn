package com.walking.lesson25.nestedclass.task1.innerclass;

// Реализуйте задачу https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson16_abstract_class_interface/task1_interface
// используя внутренние классы;

import java.util.Scanner;

public class Main {
    private static final String HORIZONTAL_SYMBOL = "-";
    private static final String LEFT_SIDE_SYMBOL = "/";
    private static final String RIGHT_SIDE_SYMBOL = "\\";
    private static final String VERTICAL_SYMBOL = "|";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length: ");
        int sideLength = scanner.nextInt();

        if (sideLength < 1) {
            scanner.close();
            throw new RuntimeException("Invalid side length. Should be greater than 0.");
        }

        System.out.println("Select a shape:\n1. square\n2. triangle");
        int selectedShape = scanner.nextInt();

        scanner.close();

        String shapeString = new Main().createShapeString(sideLength, selectedShape);
        System.out.println(shapeString);
    }

    private String createShapeString(int sideLength, int selectedShape) {
        EquilateralShape equilateralShape = switch (selectedShape) {
            case 1 -> new Square(sideLength);
            case 2 -> new EquilateralTriangle(sideLength);
            default -> throw new RuntimeException("Selected shape must be between 1 and 3");
        };

        return equilateralShape.createShapeString();
    }

    private class EquilateralTriangle implements EquilateralShape {
        private final int sideLength;


        public EquilateralTriangle(int sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public int getSideLength() {
            return sideLength;
        }

        @Override
        public String createShapeString() {
            String twoSide = getLefElement(sideLength);
            String thirdSide = getHorizontalElement(sideLength);

            return twoSide + thirdSide;
        }

        private String getLefElement(int sideLength) {
            String leftElement = EMPTY_STRING;

            for (int i = 0; i < sideLength; i++) {

                for (int j = sideLength - (i + 1); j > 0; j--) {
                    leftElement += SPACE_SYMBOL;
                }

                leftElement += LEFT_SIDE_SYMBOL + getRightElement(i) + NEXT_LINE;
            }

            return leftElement;
        }

        private String getRightElement(int index) {
            String rightElement = EMPTY_STRING;

            for (int i = 0; i < index * 2; i++) {
                rightElement += SPACE_SYMBOL;
            }

            return rightElement + RIGHT_SIDE_SYMBOL;
        }

        private String getHorizontalElement(int sideLength) {
            String horizontalElement = EMPTY_STRING;

            for (int i = 0; i < sideLength * 2; i++) {
                horizontalElement += HORIZONTAL_SYMBOL;
            }

            return horizontalElement;
        }
    }

    class Square implements EquilateralShape {
        private final int sideLength;

        public Square(int sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public int getSideLength() {
            return sideLength;
        }

        @Override
        public String createShapeString() {
            String horizontalUnit = createHorizontalLine(sideLength);
            String verticalUnit = createVerticalLine(sideLength);

            return horizontalUnit + verticalUnit + horizontalUnit;
        }

        private String createHorizontalLine(int sideLength) {
            String horizontalLine = SPACE_SYMBOL;

            for (int i = 0; i < sideLength; i++) {
                horizontalLine += HORIZONTAL_SYMBOL;
            }

            return horizontalLine + SPACE_SYMBOL + NEXT_LINE;
        }

        private String createVerticalLine(int sideLength) {
            String verticalLineUnit = EMPTY_STRING;

            for (int i = 0; i < sideLength; i++) {
                verticalLineUnit += getVerticalLineUnit(sideLength);
            }

            return verticalLineUnit;
        }

        private String getVerticalLineUnit(int sideLength) {
            String verticalLine = VERTICAL_SYMBOL;

            for (int i = 0; i < sideLength; i++) {
                verticalLine += SPACE_SYMBOL;
            }

            return verticalLine + VERTICAL_SYMBOL + NEXT_LINE;
        }
    }
}
