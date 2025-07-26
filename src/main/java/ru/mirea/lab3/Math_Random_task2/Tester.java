package ru.mirea.lab3.Math_Random_task2;

import java.util.Arrays;

public class  Tester {
    private Circle[] circles;  // массив окружностей
    private int count;         // текущее количество элементов

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count++] = circle;
        } else {
            System.out.println("Массив переполнен!");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) return null;

        Circle smallest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle findLargestCircle() {
        if (count == 0) return null;

        Circle largest = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortCircles() {
        Arrays.sort(circles, 0, count, (c1, c2) ->
                Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public void printCircles() {
        System.out.println("\nСписок окружностей:");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + circles[i]);
        }
    }


}
