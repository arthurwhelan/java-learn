package com.walking.lesson21.immutableobjects.model;

import java.util.Objects;

public class Car {
    private int number;
    private String color;
    private final CarIdentifier carIdentifier;


    public Car(String model, int year, String color, int number) {
        this(new CarIdentifier(model, year), number, color);
    }

    public Car(CarIdentifier carIdentifier, int number, String color) {
        this.carIdentifier = carIdentifier;
        this.number = number;
        this.color = color;
    }

    public CarIdentifier getCarIdentifier() {
        return carIdentifier;
    }

    @Override
    public String toString() {
        return """
                model: %s
                year: %d
                color: %s
                number: %d
                """.formatted(carIdentifier.getModel(), carIdentifier.getYear(), color, number);
    }
}
