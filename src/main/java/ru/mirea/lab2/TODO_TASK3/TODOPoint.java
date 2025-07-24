package ru.mirea.lab2.TODO_TASK3;

public class TODOPoint {
    private double x = 0.0;
    private double y = 0.0;

    public TODOPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public TODOPoint() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "Point [X: "+x+", Y: "+y+"]";
    }

}
