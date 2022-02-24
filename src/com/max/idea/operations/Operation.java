package com.max.idea.operations;

/**
 * Операция калькулятора
 */
public abstract class Operation {
    private final String operationName;
    private final String operationSign;

    public Operation(String operationName, String operationSign) {
        this.operationName = operationName;
        this.operationSign = operationSign;
    }

    /**
     * Возращает тип операции калькулятора
     * @return тип операции
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Вовзращает знак операции
     * @return знак операции
     */
    public String getOperationSign() {
        return operationSign;
    }

    public abstract double Calculate(double d1, double d2);

    @Override
    public String toString() {
        return "Операция: " + operationName +
                ", Знак: " + operationSign;
    }
}
