package com.walking.lesson4_cycles.task3;

// Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “ и |. Углы прямоугольника обозначить символом   (пробел).
// Каждая единица длины должна обозначаться одним символом -, каждая единица ширины – символом |.

import java.util.Scanner;

public class RectangleRender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        int length = scanner.nextInt();

        System.out.println("Enter the width of the rectangle");
        int width = scanner.nextInt();

        scanner.close();

        if (length <= 0 || width <= 0) {
            System.out.println("Side size must be greater than zero");
        } else {
            String lengthUnit = "-";
            String widthUnit = "|";
            String spaceUnit = " ";

            // Length block
            System.out.print(spaceUnit);

            for (int i = 0; i < length; i++) {
                System.out.print(lengthUnit);
            }

            System.out.println(spaceUnit);

            // Width block
            for (int i = 0; i < width; i++) {
                System.out.print(widthUnit);

                for (int j = 0; j < length; j++) {
                    System.out.print(spaceUnit);
                }

                System.out.println(widthUnit);
            }

            // Length block
            System.out.print(spaceUnit);

            for (int i = 0; i < length; i++) {
                System.out.print(lengthUnit);
            }

            System.out.println(spaceUnit);
        }
    }
}