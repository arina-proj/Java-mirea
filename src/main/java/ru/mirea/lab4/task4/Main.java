package ru.mirea.lab4.task4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(ProcessorBrand.INTEL, "Core i7-12700K", 3.6, 12);
        Memory memory = new Memory(MemoryType.DDR4, 32, 3200);
        Monitor monitor = new Monitor("ProDisplay XDR", MonitorType.IPS, 27.0, 5120, 2880);

        Computer computer = new Computer(ComputerBrand.APPLE, "Mac Pro", processor, memory, monitor);

        computer.displaySpecifications();
    }
}
