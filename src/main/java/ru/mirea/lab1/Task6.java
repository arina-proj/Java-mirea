package ru.mirea.lab1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int i=1; i<=10; i++){
            double res = 1.0 / i;
            System.out.printf("%-5d %-15.4f%n", i, res);
        }
    }
}
