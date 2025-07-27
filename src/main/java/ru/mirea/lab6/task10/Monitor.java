package ru.mirea.lab6.task10;
enum MonitorType {
    IPS,
    TN,
    VA,
    OLED,
    AMOLED
}
public class Monitor {
    private String model;
    private MonitorType type;
    private double size; // в дюймах
    private int resolutionX;
    private int resolutionY;

    public Monitor(String model, MonitorType type, double size, int resolutionX, int resolutionY) {
        this.model = model;
        this.type = type;
        this.size = size;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public String getSpecifications() {
        return String.format("%s, %.1f\", %s, %dx%d", model, size, type, resolutionX, resolutionY);
    }

    // Геттеры
    public String getModel() { return model; }
    public MonitorType getType() { return type; }
    public double getSize() { return size; }
    public int getResolutionX() { return resolutionX; }
    public int getResolutionY() { return resolutionY; }
}
