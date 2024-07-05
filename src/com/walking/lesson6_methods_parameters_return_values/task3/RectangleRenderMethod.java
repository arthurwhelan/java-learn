package com.walking.lesson6_methods_parameters_return_values.task3;

// Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “ и |. Углы прямоугольника обозначить символом   (пробел).
// Каждая единица длины должна обозначаться одним символом -, каждая единица ширины – символом |.

import java.util.Scanner;

public class RectangleRenderMethod {
    static String lengthSymbol = "-";
    static String widthSymbol = "|";
    static String spaceSymbol = " ";
    static String nextLine = "\n";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        scanner.close();

        printRectangle(length, width);
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
            System.out.println("Side size must be greater than zero");
            return false;
        }

        return true;
    }

    static String getLengthLine(int length) {
        StringBuilder lengthLine = new StringBuilder(spaceSymbol);

        for (int i = 0; i < length; i++) {
            lengthLine.append(lengthSymbol);
        }

        return lengthLine + spaceSymbol + nextLine;
    }

    static String getWidthLine(int width, int length) {
        StringBuilder widthLine = new StringBuilder();

        for (int i = 0; i < width; i++) {
            widthLine.append(getWidthUnit(length));
        }

        return widthLine.toString();
    }

    static String getWidthUnit(int length) {
        StringBuilder widthLineUnit = new StringBuilder(widthSymbol);

        for (int i = 0; i < length; i++) {
            widthLineUnit.append(spaceSymbol);
        }

        return widthLineUnit + widthSymbol + nextLine;
    }
}
