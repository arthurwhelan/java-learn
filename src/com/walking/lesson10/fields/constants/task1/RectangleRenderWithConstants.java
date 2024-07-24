package com.walking.lesson10.fields.constants.task1;

// Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “ и |. Углы прямоугольника обозначить символом   (пробел).
// Каждая единица длины должна обозначаться одним символом -, каждая единица ширины – символом |.

import java.util.Scanner;

public class RectangleRenderWithConstants {
    static final String REQUIRE_LENGTH_MESSAGE = "Enter the length of the rectangle: ";
    static final String REQUIRE_WIDTH_MESSAGE = "Enter the width of the rectangle: ";
    static final String ERROR_MESSAGE = "Side size must be greater than zero";

    static final Scanner SCANNER = new Scanner(System.in);

    static final String LENGTH_SYMBOL = "=";
    static final String WIDTH_SYMBOL = "||";
    static final String CORNER_SYMBOL = "  ";
    static final String NEXT_LINE = "\n";
    static final String SPACE_SYMBOL = " ";


    public static void main(String[] args) {
        int length = requireSize(REQUIRE_LENGTH_MESSAGE);
        int width = requireSize(REQUIRE_WIDTH_MESSAGE);
        SCANNER.close();

        printRectangle(length, width);
    }

    static int requireSize(String message) {
        System.out.print(message);
        return SCANNER.nextInt();
    }

    static void printRectangle(int length, int width) {

        if (validation(length, width)) {
            String lengthElement = getLengthLine(length);
            String widthElement = getWidthLine(width, length);

            System.out.println(lengthElement + widthElement + lengthElement);
        }
    }

    static boolean validation(int length, int width) {

        if (length <= 0 || width <= 0) {
            System.out.println(ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    static String getLengthLine(int length) {
        StringBuilder lengthLine = new StringBuilder(CORNER_SYMBOL);

        for (int i = 0; i < length; i++) {
            lengthLine.append(LENGTH_SYMBOL);
        }

        return lengthLine + CORNER_SYMBOL + NEXT_LINE;
    }

    static String getWidthLine(int width, int length) {
        StringBuilder widthLine = new StringBuilder();

        for (int i = 0; i < width; i++) {
            widthLine.append(getWidthUnit(length));
        }

        return widthLine.toString();
    }

    static String getWidthUnit(int length) {
        StringBuilder widthLineUnit = new StringBuilder(WIDTH_SYMBOL);

        for (int i = 0; i < length; i++) {
            widthLineUnit.append(SPACE_SYMBOL);
        }

        return widthLineUnit + WIDTH_SYMBOL + NEXT_LINE;
    }
}