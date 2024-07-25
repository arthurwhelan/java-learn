package com.walking.lesson19.objectmethods;

import com.walking.lesson19.objectmethods.model.Car;
import com.walking.lesson19.objectmethods.service.CarService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService(getCars());

        Car desiredCar = createCar();
        Car foundCar = carService.findCar(desiredCar);

        System.out.println(foundCar);
    }

    private static Car createCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car model:");
        String model = scanner.nextLine();

        System.out.println("Enter car color:");
        String color = scanner.nextLine();

        System.out.println("Enter car number:");
        int number = scanner.nextInt();
        scanner.close();

        return new Car(model, color, number);
    }

    private static Car[] getCars() {
        Car car1 = new Car("Toyota", "Red", 6652);
        Car car2 = new Car("Volvo", "Blue", 4467);
        Car car3 = new Car("Audi", "Black", 3004);
        Car car4 = new Car("BMW", "Blue", 4434);
        Car car5 = new Car("Lexus", "Blue", 6642);
        Car car6 = new Car("VW", "Blue", 3452);
        Car car7 = new Car("Citroen", "Yellow", 4301);
        Car car8 = new Car("Kamaz", "Orange", 3001);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8};
    }
}
