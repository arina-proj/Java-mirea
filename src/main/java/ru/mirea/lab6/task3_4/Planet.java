package ru.mirea.lab6.task3_4;

public class Planet implements INameable {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }
}
