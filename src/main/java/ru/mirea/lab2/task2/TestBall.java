package ru.mirea.lab2.task2;

public class TestBall {
    public static void main(String args[]){
        Ball ball_1 = new Ball();
        System.out.println(ball_1.toString());
        Ball ball_2 = new Ball(4.0, 5.2);
        System.out.println("Координата x ball_1: "+ ball_2.getX());
        System.out.println("Координата y ball_1: "+ ball_2.getY());
        ball_1.setX(10.3);
        ball_1.setY(10.3);
        ball_2.setXY(2.0, 2.0);
        System.out.println(ball_1.toString());
        System.out.println(ball_2.toString());
    }

}