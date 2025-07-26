package ru.mirea.lab4.task4;
enum MemoryType {
    DDR3,
    DDR4,
    DDR5,
    LPDDR4,
    LPDDR5
}
public class Memory {
    private MemoryType type;
    private int size; // в GB
    private int speed; // в MHz

    public Memory(MemoryType type, int size, int speed) {
        this.type = type;
        this.size = size;
        this.speed = speed;
    }

    public String getSpecifications() {
        return String.format("%dGB %s (%d MHz)", size, type, speed);
    }

    public MemoryType getType() { return type; }
    public int getSize() { return size; }
    public int getSpeed() { return speed; }
}
