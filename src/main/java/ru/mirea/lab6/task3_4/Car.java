package ru.mirea.lab6.task3_4;

public class Car implements INameable {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String getName() {
        return model + " (" + year + ")";
    }
}
