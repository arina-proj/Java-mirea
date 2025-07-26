package ru.mirea.lab2.task3;

import ru.mirea.lab3.Math_Random_task2.Circle;
import ru.mirea.lab3.Math_Random_task2.Point;
import ru.mirea.lab3.Math_Random_task2.Tester;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество окружностей: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        Tester tester = new Tester(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nВведите данные для окружности #" + (i+1));

            System.out.print("Координата X центра: ");
            double x = scanner.nextDouble();

            System.out.print("Координата Y центра: ");
            double y = scanner.nextDouble();

            System.out.print("Радиус окружности: ");
            double radius = scanner.nextDouble();
            scanner.nextLine(); // очистка буфера

            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        tester.printCircles();

        System.out.println("\nСамая маленькая окружность:");
        System.out.println(tester.findSmallestCircle());

        System.out.println("\nСамая большая окружность:");
        System.out.println(tester.findLargestCircle());

        tester.sortCircles();
        System.out.println("\nОтсортированные окружности:");
        tester.printCircles();

        scanner.close();
    }
}
