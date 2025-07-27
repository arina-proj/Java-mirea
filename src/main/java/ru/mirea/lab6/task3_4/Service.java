package ru.mirea.lab6.task3_4;

public class Service implements IPriceable {
    private String description;
    private double hourlyRate;
    private double hours;

    public Service(String description, double hourlyRate, double hours) {
        this.description = description;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    public String getDescription() {
        return description;
    }
}