package com.max.idea.staff;

/**
 * Мармелад
 */
public class Jellybean extends Staff {
    private String color;

    public Jellybean(String name, double weight, double price, String color) {
        super( name, weight, price );
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Мармелад{" +
                super.toString() +
                ", color=" + getColor() +
                '}';
    }
}
