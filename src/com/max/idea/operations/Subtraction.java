package com.max.idea.operations;

/**
 * Операция вычитания двух дробных чисел
 */
public class Subtraction extends Operation {
    private static final String OPERATION_NAME = "Вычитание";
    private static final String OPERATION_SIGN = "-";

    public Subtraction() {
        super( OPERATION_NAME, OPERATION_SIGN );
    }

    @Override
    public double Calculate(double d1, double d2) {
        return d1 - d2;
    }
}
