package com.walking.lesson14_polymorphism_overriding_method.task1.model;

public class EquilateralRectangle extends EquilateralFigure {
    private static final String HORIZONTAL_SYMBOL = "-";
    private static final String LEFT_SIDE_SYMBOL = "/";
    private static final String RIGHT_SIDE_SYMBOL = "\\";

    public EquilateralRectangle(int sideLength) {
        super(sideLength);
    }

    public String createFigure() {
        String twoSide = getLefElement(sideLength);
        String thirdSide = getHorizontalElement(sideLength);

        return twoSide + thirdSide;
    }

    private String getLefElement(int sideLength) {
        String leftElement = EMPTY_STRING;

        for (int i = 0; i < sideLength; i++) {

            for (int j = sideLength - (i + 1); j > 0; j--) {
                leftElement += SPACE_SYMBOL;
            }

            leftElement += LEFT_SIDE_SYMBOL + getRightElement(i) + NEXT_LINE;
        }

        return leftElement;
    }

    private String getRightElement(int index) {
        String rightElement = EMPTY_STRING;

        for (int i = 0; i < index * 2; i++) {
            rightElement += SPACE_SYMBOL;
        }

        return rightElement + RIGHT_SIDE_SYMBOL;
    }

    private String getHorizontalElement (int sideLength) {
        String horizontalElement = EMPTY_STRING;

        for (int i = 0; i < sideLength * 2; i++) {
            horizontalElement += HORIZONTAL_SYMBOL;
        }

        return horizontalElement;
    }
}
