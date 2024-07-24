package com.walking.lesson10.fields.constants.task2.model;

public class CounterWithFinal {
    public final String name;
    public int counter;

    public CounterWithFinal(String name) {
        this(name, 0);
    }

    public CounterWithFinal(String name, int value) {
        this.name = name;
        this.counter = value;
    }

    public int incrementValue() {
        return ++counter;
    }

    public int decrementValue() {
        return --counter;
    }

    public int increaseValue(int value) {
        counter += value;
        return counter;
    }

    public int decreaseValue(int value) {
        counter -= value;
        return counter;
    }
}
