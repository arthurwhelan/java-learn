package com.walking.lesson16.abstract_classes_and_interfaces.task1.abstracts.model;

public abstract class EquilateralFigure {
    protected final int sideLength;
    protected static final String SPACE_SYMBOL = " ";
    protected static final String NEXT_LINE = "\n";
    protected static final String EMPTY_STRING = "";

    public EquilateralFigure(int sideLength) {
        this.sideLength = sideLength;
    }

    public abstract String createFigure();
}
