package com.walking.lesson19.objectmethods.model;

import java.util.Objects;

public class Car {
    private final String model;
    private final String color;
    private final int number;

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color) * 31;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number;
    }
}
