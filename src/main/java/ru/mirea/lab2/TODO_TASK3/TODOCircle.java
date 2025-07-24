package ru.mirea.lab2.TODO_TASK3;

public class TODOCircle {
   private int center_y;
   private int center_x;
   private int distance;
   private int angle;

    public TODOCircle(int center_y, int center_x, int distance, int angle) {
        this.center_y = center_y;
        this.center_x = center_x;
        this.distance = distance;
        this.angle = angle;
    }

    public TODOCircle() {
    }

    public int getCenter_y() {
        return center_y;
    }

    public void setCenter_y(int center_y) {
        this.center_y = center_y;
    }

    public int getCenter_x() {
        return center_x;
    }

    public void setCenter_x(int center_x) {
        this.center_x = center_x;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    double x = center_x + distance*Math.cos(angle);
    double y = center_y + distance*Math.sin(angle);
}
