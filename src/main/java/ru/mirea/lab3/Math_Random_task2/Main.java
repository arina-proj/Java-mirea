package ru.mirea.lab3.Math_Random_task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Point center = new Point(
                    random.nextDouble() * 10, // x от 0 до 10
                    random.nextDouble() * 10  // y от 0 до 10
            );

            double radius = Math.random() * 4 + 1;

            tester.addCircle(new Circle(center, radius));
        }

        tester.printCircles();

        System.out.println("\nСамая маленькая окружность:");
        System.out.println(tester.findSmallestCircle());

        System.out.println("\nСамая большая окружность:");
        System.out.println(tester.findLargestCircle());

        tester.sortCircles();
        System.out.println("\nОтсортированные окружности:");
        tester.printCircles();
    }
}
