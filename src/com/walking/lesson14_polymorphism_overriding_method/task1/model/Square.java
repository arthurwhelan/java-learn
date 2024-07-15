package com.walking.lesson14_polymorphism_overriding_method.task1.model;

public class Square extends EquilateralFigure {
    private static final String HORIZONTAL_SYMBOL = "-";
    private static final String VERTICAL_SYMBOL = "|";

    public Square(int sideLength) {
        super(sideLength);
    }

    @Override
    public String createFigure() {
        String horizontalUnit = createHorizontalLine(sideLength);
        String verticalUnit = createVerticalLine(sideLength);

        return horizontalUnit + verticalUnit + horizontalUnit;
    }

    private String createHorizontalLine(int sideLength) {
        String horizontalLine = SPACE_SYMBOL;

        for (int i = 0; i < sideLength; i++) {
            horizontalLine += HORIZONTAL_SYMBOL;
        }

        return horizontalLine + SPACE_SYMBOL + NEXT_LINE;
    }

    private String createVerticalLine(int sideLength) {
        String verticalLineUnit = EMPTY_STRING;

        for (int i = 0; i < sideLength; i++) {
            verticalLineUnit += getVerticalLineUnit(sideLength);
        }

        return verticalLineUnit;
    }

    private String getVerticalLineUnit(int sideLength) {
        String verticalLine = VERTICAL_SYMBOL;

        for (int i = 0; i < sideLength; i++) {
            verticalLine += SPACE_SYMBOL;
        }

        return verticalLine + VERTICAL_SYMBOL + NEXT_LINE;
    }
}
