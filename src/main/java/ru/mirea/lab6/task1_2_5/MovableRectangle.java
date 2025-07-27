package ru.mirea.lab6.task1_2_5;

public class MovableRectangle implements IMovable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        bottomRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
        topLeft.moveRight();
    }
    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft.toString() + ", bottomRight=" + bottomRight + "]";
    }
}
