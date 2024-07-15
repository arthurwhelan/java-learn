package com.walking.lesson14_polymorphism_overriding_method.task1.model;

public class EquilateralFigure {
    protected final int sideLength;
    protected static final String SPACE_SYMBOL = " ";
    protected static final String NEXT_LINE = "\n";
    protected static final String EMPTY_STRING = "";

    public EquilateralFigure(int sideLength) {
        this.sideLength = sideLength;
    }

    public String createFigure() {
        return "Unknown figure";
    }
}
