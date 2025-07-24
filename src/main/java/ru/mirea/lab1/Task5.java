package ru.mirea.lab1;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        // Цикл for для перебора всех аргументов
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
