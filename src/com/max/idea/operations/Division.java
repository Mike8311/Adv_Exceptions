package com.max.idea.operations;

/**
 * Операция деления двух дробных чисел
 */
public class Division extends Operation {
    private static final String OPERATION_NAME = "Деление";
    private static final String OPERATION_SIGN = "/";

    public Division() {
        super( OPERATION_NAME, OPERATION_SIGN );
    }

    @Override
    public double Calculate(double d1, double d2) {
        return d1 / d2;
    }
}
