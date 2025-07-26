package ru.mirea.lab4.task4;

public class Processor {
    private ProcessorBrand brand;
    private String model;
    private double clockSpeed; // в GHz
    private int cores;

    public Processor(ProcessorBrand brand, String model, double clockSpeed, int cores) {
        this.brand = brand;
        this.model = model;
        this.clockSpeed = clockSpeed;
        this.cores = cores;
    }

    public String getSpecifications() {
        return String.format("%s %s, %.2f GHz, %d ядер", brand, model, clockSpeed, cores);
    }

    public ProcessorBrand getBrand() { return brand; }
    public String getModel() { return model; }
    public double getClockSpeed() { return clockSpeed; }
    public int getCores() { return cores; }
}
