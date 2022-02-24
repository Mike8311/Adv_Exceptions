package com.max.idea.operations;

/**
 * Операция сложения двух дробных чисел
 */
public class Addition extends Operation {
    private static final String OPERATION_NAME = "Сложение";
    private static final String OPERATION_SIGN = "+";

    public Addition() {
        super( OPERATION_NAME, OPERATION_SIGN );
    }

    @Override
    public double Calculate(double d1, double d2) {
        return d1 + d2;
    }
}
