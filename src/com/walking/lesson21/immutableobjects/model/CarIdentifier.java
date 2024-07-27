package com.walking.lesson21.immutableobjects.model;

import java.util.Objects;

public class CarIdentifier {
    private final String model;
    private final int year;


    public CarIdentifier(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarIdentifier carIdentifier = (CarIdentifier) o;
        return year == carIdentifier.year && Objects.equals(model, carIdentifier.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year) * 31;
    }
}
