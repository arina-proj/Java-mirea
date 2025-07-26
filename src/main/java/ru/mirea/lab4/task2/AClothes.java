package ru.mirea.lab4.task2;

public abstract class AClothes {
    private task.Size size;
    private double price;
    private String color;

    public AClothes(task.Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public AClothes() {
    }

    public task.Size getSize() {
        return size;
    }

    public void setSize(task.Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
