package com.walking.lesson20.exceptions.task2.model;

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
