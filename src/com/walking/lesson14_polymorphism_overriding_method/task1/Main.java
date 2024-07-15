package com.walking.lesson14_polymorphism_overriding_method.task1;

// Реализуйте класс «Правильная фигура». Для него создайте классы-наследники Треугольник и Квадрат.
// Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
// Программа должна нарисовать в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
// Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.

import com.walking.lesson14_polymorphism_overriding_method.task1.model.Square;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square.createFigure());
    }
}
