package ru.mirea.lab3.Math_Random_task2;

public class Point {
    private double x; // координата x
    private double y; // координата y

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
