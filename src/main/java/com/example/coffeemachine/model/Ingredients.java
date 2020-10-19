package com.example.coffeemachine.model;


public class Ingredients {
    private int water;

    private int coffee;

    private int milk;

    public Ingredients(int water, int coffee, int milk) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
}
