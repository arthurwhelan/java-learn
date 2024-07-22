package com.walking.lesson19_object_methods.service;

import com.walking.lesson19_object_methods.model.Car;

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
