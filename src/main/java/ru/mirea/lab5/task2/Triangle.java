package ru.mirea.lab5.task2;

import java.awt.*;

public class Triangle extends AShape{
    private int height;

    public Triangle(Color color, int x, int y, int height) {
        super(color, x, y);
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x - height/2, x + height/2};
        int[] yPoints = {y, y + height, y + height};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
