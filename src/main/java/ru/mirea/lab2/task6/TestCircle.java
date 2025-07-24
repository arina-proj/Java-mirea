package ru.mirea.lab2.task6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(2.0);
        Circle circle4 = new Circle(3.5);

        System.out.println("Радиус circle1: " + circle1.getRadius());
        System.out.println("Радиус circle2: " + circle2.getRadius());
        System.out.println("Радиус circle3: " + circle3.getRadius());
        System.out.println("Радиус circle4: " + circle4.getRadius());

        System.out.println("\nПлощадь circle1: " + circle1.getArea());
        System.out.println("Длина окружности circle2: " + circle2.getCircumference());

        System.out.println("\nСравнение:");
        System.out.println("circle1 и circle2: " + circle1.equals(circle2));
        System.out.println("circle2 и circle4: " + circle2.equals(circle4));

        circle1.setRadius(2.5);
        System.out.println("\nИзмененный circle1: " + circle1);
    }
}
