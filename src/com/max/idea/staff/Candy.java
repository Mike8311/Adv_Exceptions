package com.max.idea.staff;

/**
 * Конфета
 */
public class Candy extends Staff {
    private double size;

    public Candy(String name, double weight, double price, double size) {
        super( name, weight, price );
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Конфета{" +
                super.toString() +
                ", size=" + getSize() +
                '}';
    }
}
