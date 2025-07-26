package ru.mirea.lab2.task3;

import ru.mirea.lab3.Math_Random_task2.Point;

public class Circle {
    private Point center;  // центр окружности
    private double radius; // радиус

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return radius; }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius +
                ", circumference=" + getCircumference() + "]";
    }
}
