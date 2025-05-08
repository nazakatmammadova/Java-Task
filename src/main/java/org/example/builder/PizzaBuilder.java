package org.example.builder;
public class PizzaBuilder {
    private String size;
    private boolean cheese;
    private  boolean pepperoni;
    private  boolean olives;
    private  boolean mushrooms;

    public PizzaBuilder(String size){
        this.size=size;
    }
    public PizzaBuilder setCheese(boolean value) {
        this.cheese = value;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean value) {
        this.pepperoni = value;
        return this;
    }

    public PizzaBuilder setOlives(boolean value) {
        this.olives = value;
        return this;
    }

    public PizzaBuilder setMushrooms(boolean value) {
        this.mushrooms = value;
        return this;
    }

    public Pizza build() {
        return new Pizza(size,cheese,pepperoni,olives,mushrooms);
    }
}
