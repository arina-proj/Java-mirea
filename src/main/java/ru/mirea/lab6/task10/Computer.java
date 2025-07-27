package ru.mirea.lab6.task10;



enum ComputerBrand {
    ASUS,
    DELL,
    HP,
    LENOVO,
    APPLE,
    ACER,
    CUSTOM
}


public class Computer {
    private ComputerBrand brand;
    private String model;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, String model, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void displaySpecifications() {
        System.out.println("=== Характеристики компьютера ===");
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Процессор: " + processor.getSpecifications());
        System.out.println("Память: " + memory.getSpecifications());
        System.out.println("Монитор: " + monitor.getSpecifications());
    }
    public ComputerBrand getBrand() { return brand; }
    public String getModel() { return model; }
    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }
}
