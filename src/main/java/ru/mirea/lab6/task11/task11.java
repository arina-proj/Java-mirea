package ru.mirea.lab6.task11;

import java.util.Scanner;

interface Convertable {
    double convert(double temperature);
}
class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9/5 + 32;
    }
}

public class task11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертер температур");
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        Convertable toKelvin = new CelsiusToKelvin();
        Convertable toFahrenheit = new CelsiusToFahrenheit();

        double kelvin = toKelvin.convert(celsius);
        double fahrenheit = toFahrenheit.convert(celsius);

        System.out.println("\nРезультаты конвертации:");
        System.out.printf("%.2f °C = %.2f K (Кельвин)\n", celsius, kelvin);
        System.out.printf("%.2f °C = %.2f °F (Фаренгейт)\n", celsius, fahrenheit);

        scanner.close();
    }
}