package com.walking.lesson19.objectmethods.service;

import com.walking.lesson19.objectmethods.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(Car car) {
        for (Car c : cars) {
            if (c.hashCode() == car.hashCode() && c.equals(car)) {
                return c;
            }
        }
        return null;
    }
}
