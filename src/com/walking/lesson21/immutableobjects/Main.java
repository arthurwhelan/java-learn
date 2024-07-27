package com.walking.lesson21.immutableobjects;

import com.walking.lesson21.immutableobjects.model.Car;
import com.walking.lesson21.immutableobjects.model.CarIdentifier;
import com.walking.lesson21.immutableobjects.service.CarService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService(getCars());

        CarIdentifier desiredCar = createCarIdentifier();
        Car foundCar = carService.findCar(desiredCar);

        System.out.println(foundCar);
    }

    private static CarIdentifier createCarIdentifier() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car color: ");
        int year = scanner.nextInt();

        scanner.close();

        return new CarIdentifier(model, year);
    }

    private static Car[] getCars() {
        Car car1 = new Car("Toyota", 2002, "Red", 6652);
        Car car2 = new Car("Volvo", 1998, "Blue", 4467);
        Car car3 = new Car("Audi", 2001, "Black", 3004);
        Car car4 = new Car("BMW", 2010, "Blue", 4434);
        Car car5 = new Car("Lexus", 2005, "Blue", 6642);
        Car car6 = new Car("VW", 2015, "Blue", 3452);
        Car car7 = new Car("Citroen", 2017, "Yellow", 4301);
        Car car8 = new Car("Mercedes", 1991, "Orange", 3001);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8};
    }
}
