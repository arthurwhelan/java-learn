package com.walking.lesson8_classes_ojects_constructors_and_keyword_this.task1.model;

public class Counter {
    public String name;
    public int counter;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int value) {
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
