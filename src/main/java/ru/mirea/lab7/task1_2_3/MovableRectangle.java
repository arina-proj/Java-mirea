package ru.mirea.lab7.task1_2_3;

import ru.mirea.lab6.task1_2_5.IMovable;

public class MovableRectangle implements IMovable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    // Параметризированный конструктор
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Метод проверки одинаковой скорости точек
    public boolean speedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() &&
                topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public void moveUp() {
        if (speedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        } else {
            System.out.println("Ошибка: точки имеют разную скорость!");
        }
    }

    @Override
    public void moveDown() {
        if (speedTest()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (speedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (speedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    // Метод для строкового представления
    @Override
    public String toString() {
        return String.format("Rectangle[\n  topLeft=%s\n  bottomRight=%s\n  width=%d, height=%d\n  speedTest=%b]",
                topLeft, bottomRight, getWidth(), getHeight(), speedTest());
    }

    // Вспомогательные методы
    public int getWidth() { return bottomRight.getX() - topLeft.getX(); }
    public int getHeight() { return topLeft.getY() - bottomRight.getY(); }
}