package com.walking.lesson12_encapsulation_packages_access_modifiers_getters_and_setters.counterAggregation.model;

public class Counter {
    private final String name;
    private final String unit;
    private int value;

    public Counter(String name, String unit) {
        this(name, unit, 0);
    }

    public Counter(String name, String unit, int value) {
        this.name = name;
        this.unit = unit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
