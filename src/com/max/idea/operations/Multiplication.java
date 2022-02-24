package com.max.idea.operations;

/**
 * Операция умножения двух дробных чисел
 */
public class Multiplication extends Operation {
    private static final String OPERATION_NAME = "Умножение";
    private static final String OPERATION_SIGN = "*";

    public Multiplication() {
        super( OPERATION_NAME, OPERATION_SIGN );
    }

    @Override
    public double Calculate(double d1, double d2) {
        return d1 * d2;
    }
}
