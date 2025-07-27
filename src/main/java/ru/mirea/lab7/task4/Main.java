package ru.mirea.lab7.task4;

public class Main {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        ComplexNumber num = new ComplexNumber(1, 1);
        System.out.println("Исходное число: " + num);
        System.out.println("В квадрате: " + math.complexPower(num, 2));
        System.out.println("В кубе: " + math.complexPower(num, 3));
        System.out.println("Длина окружности (r=5): " + math.circleCircumference(5));
        System.out.println("Значение PI: " + IMathCalculable.PI);
    }
}