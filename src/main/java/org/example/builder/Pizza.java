package org.example.builder;
public final class Pizza {
    private String size;
    private boolean cheese;
    private  boolean pepperoni;
    private  boolean olives;
    private  boolean mushrooms;

    public Pizza(String size, boolean cheese, boolean pepperoni, boolean olives, boolean mushrooms) {
        this.size=size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.olives = olives;
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", olives=" + olives +
                ", mushrooms=" + mushrooms +
                '}';
    }
}
