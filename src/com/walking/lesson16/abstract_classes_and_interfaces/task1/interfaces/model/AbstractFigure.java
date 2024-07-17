package com.walking.lesson16.abstract_classes_and_interfaces.task1.interfaces.model;

public abstract class AbstractFigure implements Figure {
    protected final int sideLength;

    public AbstractFigure(int sideLength) {
        this.sideLength = sideLength;
    }
}
