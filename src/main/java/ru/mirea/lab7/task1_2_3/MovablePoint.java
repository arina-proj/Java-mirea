package ru.mirea.lab7.task1_2_3;

import ru.mirea.lab6.task1_2_5.IMovable;
public class MovablePoint implements IMovable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }
    public int getY() { return y; }
    public int getX() { return x; }

    @Override
    public void moveUp() { y -= ySpeed; }
    @Override
    public void moveDown() { y += ySpeed; }
    @Override
    public void moveLeft() { x -= xSpeed; }
    @Override
    public void moveRight() { x += xSpeed; }

    // Метод для строкового представления
    @Override
    public String toString() {
        return String.format("Point(x=%d, y=%d, xSpeed=%d, ySpeed=%d)", x, y, xSpeed, ySpeed);
    }
}