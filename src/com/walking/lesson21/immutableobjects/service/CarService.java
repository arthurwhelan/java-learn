package com.walking.lesson21.immutableobjects.service;

import com.walking.lesson21.immutableobjects.model.Car;
import com.walking.lesson21.immutableobjects.model.CarIdentifier;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(CarIdentifier carIdentifier) {
        for (Car c : cars) {
            if (c.getCarIdentifier().equals(carIdentifier)) {
                return c;
            }
        }

        throw new NullPointerException();
    }
}
